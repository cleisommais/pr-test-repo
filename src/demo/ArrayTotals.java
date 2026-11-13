package demo;

public final class ArrayTotals {
    private ArrayTotals() {}

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i <= values.length; i++) {
            total += values[i];
        }
        return total;
    }
}
