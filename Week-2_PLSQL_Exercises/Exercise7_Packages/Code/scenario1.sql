CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(id NUMBER, name VARCHAR2, dob DATE, balance NUMBER);
    PROCEDURE UpdateCustomer(id NUMBER, name VARCHAR2);
    FUNCTION GetBalance(id NUMBER) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
    PROCEDURE AddCustomer(id NUMBER, name VARCHAR2, dob DATE, balance NUMBER) IS
    BEGIN
        INSERT INTO Customers VALUES(id, name, dob, balance, SYSDATE);
    END;

    PROCEDURE UpdateCustomer(id NUMBER, name VARCHAR2) IS
    BEGIN
        UPDATE Customers SET Name = name WHERE CustomerID = id;
    END;

    FUNCTION GetBalance(id NUMBER) RETURN NUMBER IS
        bal NUMBER;
    BEGIN
        SELECT Balance INTO bal FROM Customers WHERE CustomerID = id;
        RETURN bal;
    END;
END CustomerManagement;
/