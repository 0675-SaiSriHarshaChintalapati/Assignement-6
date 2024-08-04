import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "programming", "predicate", "composition");
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsSubstring = s -> s.contains("o");
        List<String> filteredStrings = strings.stream()
                .filter(lengthGreaterThan5.and(containsSubstring))
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}