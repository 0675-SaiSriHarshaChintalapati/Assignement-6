import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person {
    String name;
    int age;
    double salary;
    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, 50000));
        people.add(new Person("Jane", 30, 60000));
        people.add(new Person("Alice", 22, 70000));
        Collections.sort(people, Comparator.comparing(person -> person.age));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

