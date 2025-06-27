CREATE OR REPLACE PROCEDURE TransferFunds(
    fromID IN NUMBER,
    toID IN NUMBER,
    amt IN NUMBER
) IS
    from_bal NUMBER;
BEGIN
    SELECT Balance INTO from_bal FROM Accounts WHERE AccountID = fromID FOR UPDATE;

    IF from_bal < amt THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance.');
        ROLLBACK;
        RETURN;
    END IF;

    UPDATE Accounts SET Balance = Balance - amt WHERE AccountID = fromID;
    UPDATE Accounts SET Balance = Balance + amt WHERE AccountID = toID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
END;
/