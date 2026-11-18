package demo;

public final class OciTotals {
    private OciTotals() {}

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
