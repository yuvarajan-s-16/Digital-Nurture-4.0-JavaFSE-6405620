CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(id NUMBER, name VARCHAR2, pos VARCHAR2, sal NUMBER, dept VARCHAR2);
    PROCEDURE UpdateEmployee(id NUMBER, sal NUMBER);
    FUNCTION AnnualSalary(id NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
    PROCEDURE HireEmployee(id NUMBER, name VARCHAR2, pos VARCHAR2, sal NUMBER, dept VARCHAR2) IS
    BEGIN
        INSERT INTO Employees VALUES(id, name, pos, sal, dept, SYSDATE);
    END;

    PROCEDURE UpdateEmployee(id NUMBER, sal NUMBER) IS
    BEGIN
        UPDATE Employees SET Salary = sal WHERE EmployeeID = id;
    END;

    FUNCTION AnnualSalary(id NUMBER) RETURN NUMBER IS
        annual NUMBER;
    BEGIN
        SELECT Salary * 12 INTO annual FROM Employees WHERE EmployeeID = id;
        RETURN annual;
    END;
END EmployeeManagement;
/
