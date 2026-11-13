package demo;

public final class ArrayTotals {
    private ArrayTotals() {}

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }
    public static int countPositive(int[] values) {
        int count = 0;
        for (int value : values) {
            if (value > 0) count++;
        }
        return count;
    }
}
