DECLARE
    CURSOR acc_cur IS SELECT AccountID, Balance FROM Accounts;
BEGIN
    FOR acc IN acc_cur LOOP
        UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = acc.AccountID;
    END LOOP;
    COMMIT;
END;
/