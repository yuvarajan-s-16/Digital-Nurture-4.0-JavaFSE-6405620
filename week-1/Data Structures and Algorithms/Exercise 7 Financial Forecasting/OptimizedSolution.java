import java.util.HashMap;

public class OptimizedSolution {

    private static HashMap<Integer, Double> memo = new HashMap<>();

    public static double forecastMemo(int year, double initialAmount, double growthRate) {
        if (year == 0) return initialAmount;
        if (memo.containsKey(year)) return memo.get(year);

        double value = forecastMemo(year - 1, initialAmount, growthRate) * (1 + growthRate);
        memo.put(year, value);
        return value;
    }
}
