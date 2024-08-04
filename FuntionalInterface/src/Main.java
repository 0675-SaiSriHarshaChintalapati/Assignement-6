@FunctionalInterface
interface TwoIntegersOperation {
    int operation(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        TwoIntegersOperation sum = (a, b) -> a + b;
        int result = sum.operation(5, 3);
        System.out.println("The sum is: " + result);
    }
}
