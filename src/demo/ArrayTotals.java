package demo;

public final class ArrayTotals {
    private ArrayTotals() {}

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
