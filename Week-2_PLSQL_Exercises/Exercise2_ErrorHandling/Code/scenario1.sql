CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    fromAccountID IN NUMBER,
    toAccountID IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
    from_balance NUMBER;
BEGIN
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = fromAccountID FOR UPDATE;

    IF from_balance < amount THEN
        RAISE insufficient_balance;
    END IF;

    UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = fromAccountID;
    UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = toAccountID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
EXCEPTION
    WHEN insufficient_balance THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/