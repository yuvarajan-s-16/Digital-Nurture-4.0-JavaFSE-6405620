CREATE TABLE AuditLog (
    LogID NUMBER GENERATED ALWAYS AS IDENTITY,
    ActionDate DATE,
    AccountID NUMBER,
    Amount NUMBER,
    ActionType VARCHAR2(20)
);

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (ActionDate, AccountID, Amount, ActionType)
    VALUES (SYSDATE, :NEW.AccountID, :NEW.Amount, :NEW.TransactionType);
END;
/
