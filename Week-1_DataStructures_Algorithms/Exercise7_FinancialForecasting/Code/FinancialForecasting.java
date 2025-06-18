public class FinancialForecasting {
    // Recursive calculation
    static double futureValue(double[] past, int years, double growthRate) {
        if(years==0) return past[past.length-1];
        return futureValue(past, years-1, growthRate) * (1+growthRate);
    }
    public static void main(String[] args) {
        double[] past = {1000, 1200, 1400, 1600};
        double future = futureValue(past, 2, 0.1); 
        System.out.println(future);
    }
}