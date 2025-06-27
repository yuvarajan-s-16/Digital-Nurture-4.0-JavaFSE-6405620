CREATE OR REPLACE PROCEDURE UpdateSalary(
    empID IN NUMBER,
    percentage IN NUMBER
) IS
    no_data_found EXCEPTION;
    emp_exists NUMBER := 0;
BEGIN
    SELECT COUNT(*) INTO emp_exists FROM Employees WHERE EmployeeID = empID;

    IF emp_exists = 0 THEN
        RAISE no_data_found;
    END IF;

    UPDATE Employees
    SET Salary = Salary + (Salary * percentage / 100)
    WHERE EmployeeID = empID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Salary updated successfully.');
EXCEPTION
    WHEN no_data_found THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee does not exist.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/