DECLARE
    CURSOR loan_cur IS SELECT LoanID, InterestRate FROM Loans;
BEGIN
    FOR loan IN loan_cur LOOP
        UPDATE Loans
        SET InterestRate = loan.InterestRate + 0.5
        WHERE LoanID = loan.LoanID;
    END LOOP;
    COMMIT;
END;
/