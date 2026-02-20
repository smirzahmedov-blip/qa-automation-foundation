public class UtilityCalculator {

    public static void main(String[] args) {

        int sum = add(5, 3);
        printResult(sum);

        int product = multiply(4, 2);
        printResult(product);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
