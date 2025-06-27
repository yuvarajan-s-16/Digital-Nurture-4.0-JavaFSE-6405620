CREATE OR REPLACE PROCEDURE AddNewCustomer(
    custID IN NUMBER,
    custName IN VARCHAR2,
    dob IN DATE,
    balance IN NUMBER
) IS
    duplicate_customer EXCEPTION;
    cust_exists NUMBER := 0;
BEGIN
    SELECT COUNT(*) INTO cust_exists FROM Customers WHERE CustomerID = custID;

    IF cust_exists > 0 THEN
        RAISE duplicate_customer;
    END IF;

    INSERT INTO Customers(CustomerID, Name, DOB, Balance, LastModified)
    VALUES(custID, custName, dob, balance, SYSDATE);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added successfully.');
EXCEPTION
    WHEN duplicate_customer THEN
        DBMS_OUTPUT.PUT_LINE('Error: Customer with ID already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Insertion failed: ' || SQLERRM);
END;
/

EXEC AddNewCustomer(101, 'Arun Kumar', TO_DATE('1998-07-25','YYYY-MM-DD'), 5000);
EXEC AddNewCustomer(101, 'Akshaya', TO_DATE('2025-07-25','YYYY-MM-DD'), 5000);