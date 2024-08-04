@FunctionalInterface
interface SquareCalculator {
    int calculateSquare(int x);

    default void printSquare(int x) {
        int square = calculateSquare(x);
        System.out.println("The square of " + x + " is " + square);
    }
}
public class Main{
    public static void main(String[] args) {
        SquareCalculator calculator = x -> x * x;
        calculator.printSquare(5);
    }
}