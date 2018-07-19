package task1;

public class HashCodeTask {
    private static int A1 = 1;
    private static int A2 = 2;
    private static int B1 = 3;
    private static int B2 = 4;
    private static int C1 = 5;
    private static int C2 = 6;

    private int a; // may change from a1 to a2
    private int b; // may change from b1 to b2
    private int c; // may change from c1 to c2

    @Override
    public int hashCode() {
        return (((A2 - A1) + (a - A1)) * (B2 - B1) + (b - B1)) * (C2 - C1) + (c - C1);
    }
}
