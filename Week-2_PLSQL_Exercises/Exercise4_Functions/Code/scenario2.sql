CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    principal IN NUMBER,
    annualRate IN NUMBER,
    years IN NUMBER
) RETURN NUMBER IS
    monthlyRate NUMBER := annualRate / 1200;
    months NUMBER := years * 12;
    emi NUMBER;
BEGIN
    IF monthlyRate = 0 THEN
        RETURN principal / months;
    END IF;
    emi := principal * monthlyRate / (1 - POWER(1 + monthlyRate, -months));
    RETURN emi;
END;
/