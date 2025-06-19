public class FinancialForecast {

    public static double forecastRecursive(int year, double initialAmount, double growthRate) {
        if (year == 0) return initialAmount;
        return forecastRecursive(year - 1, initialAmount, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        int year = 5;
        double initial = 10000;
        double growthRate = 0.10;

        double result = forecastRecursive(year, initial, growthRate);
        System.out.printf("Recursive: Future value after %d years = $%.2f\n", year, result);

        double optimizedResult = OptimizedSolution.forecastMemo(year, initial, growthRate);
        System.out.printf("Optimized Recursive: Future value after %d years = $%.2f\n", year, optimizedResult);
    }
}
