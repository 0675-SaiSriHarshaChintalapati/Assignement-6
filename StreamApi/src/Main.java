import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Berry");
        List<String> filteredList = list.stream()
                .filter(s -> !s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}