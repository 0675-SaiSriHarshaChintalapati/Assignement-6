import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "consumer");
        Consumer<String> toUpperCaseAndPrint = s -> System.out.println(s.toUpperCase());
        strings.forEach(toUpperCaseAndPrint);
    }
}