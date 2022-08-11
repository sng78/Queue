import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person;
        Deque<Person> list = new LinkedList<>(generateClients());

        while (!list.isEmpty()) {
            person = list.poll();
            if (person.tickets != 0) {
                System.out.println(person + " прокатился на аттракционе");
                person.tickets -= 1;
                list.offerLast(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Антон", "Чехов", 2));
        list.add(new Person("Максим", "Горький", 3));
        list.add(new Person("Александр", "Пушкин", 2));
        list.add(new Person("Лев", "Толстой", 4));
        list.add(new Person("Федор", "Достоевский", 1));
        return list;
    }
}