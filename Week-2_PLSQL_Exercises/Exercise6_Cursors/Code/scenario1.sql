DECLARE
    CURSOR txn_cur IS
        SELECT c.CustomerID, c.Name, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE TO_CHAR(t.TransactionDate, 'MMYYYY') = TO_CHAR(SYSDATE, 'MMYYYY');
BEGIN
    FOR rec IN txn_cur LOOP
        DBMS_OUTPUT.PUT_LINE('Customer ' || rec.Name || ' had a ' || rec.TransactionType ||
                             ' of ' || rec.Amount);
    END LOOP;
END;
/