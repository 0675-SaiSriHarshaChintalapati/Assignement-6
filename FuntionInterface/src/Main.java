import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, Double> area = radius -> Math.PI * radius * radius;
        double radius = 5.0;
        System.out.println("Area of the circle: " + area.apply(radius));
    }
}