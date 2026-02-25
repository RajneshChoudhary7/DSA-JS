package placement.Patternprinting;


public class optimizedfirst {
    public static void printPattern(int n, boolean increasing) {

        if (increasing) {
            for (int i = 1; i <= n; i++) {
                printX(i);
            }
        } else {
            for (int i = n; i >= 1; i--) {
                printX(i);
            }
        }
    }

    public static void printX(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("X");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printPattern(4, true);   // Increasing
        System.out.println();
        printPattern(5, false);  // Decreasing
    }
}
