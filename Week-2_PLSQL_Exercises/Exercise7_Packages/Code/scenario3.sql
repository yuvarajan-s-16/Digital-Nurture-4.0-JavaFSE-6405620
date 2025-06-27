CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(accID NUMBER, custID NUMBER, accType VARCHAR2, balance NUMBER);
    PROCEDURE CloseAccount(accID NUMBER);
    FUNCTION TotalBalance(custID NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount(accID NUMBER, custID NUMBER, accType VARCHAR2, balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts VALUES(accID, custID, accType, balance, SYSDATE);
    END;

    PROCEDURE CloseAccount(accID NUMBER) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = accID;
    END;

    FUNCTION TotalBalance(custID NUMBER) RETURN NUMBER IS
        total NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO total FROM Accounts WHERE CustomerID = custID;
        RETURN NVL(total, 0);
    END;
END AccountOperations;
/