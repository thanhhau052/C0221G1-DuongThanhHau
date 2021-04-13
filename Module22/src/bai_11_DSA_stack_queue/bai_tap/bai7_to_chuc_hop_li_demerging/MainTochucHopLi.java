package bai_11_DSA_stack_queue.bai_tap.bai7_to_chuc_hop_li_demerging;

import java.util.*;

public class MainTochucHopLi {
    public static void main(String[] args) {
        Person[] persons = new Person[6];
        persons[0] = new Person("Cuong", "Nu", 1999);
        persons[1] = new Person("Thao", "Nam", 1995);
        persons[2] = new Person("Khanh", "Nu", 2000);
        persons[3] = new Person("Nam", "Nu", 1988);
        persons[4] = new Person("Ha", "Nu", 2002);
        persons[5] = new Person("Toan", "Nu", 1993);
        final Queue<Person> MALE = new LinkedList<>();
        final Queue<Person> FEMALE = new LinkedList<>();

        Stack<Person> output = new Stack<>();
        Comparator<Person> comparator = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDateOfBirth() - o2.getDateOfBirth();
            }
        };
        Arrays.sort(persons, comparator);

        for (Person person : persons) {
            if (person.getGender().equals("Nu")) {
                MALE.add(person);
            } else {
                FEMALE.add(person);
            }
        }
        while (!FEMALE.isEmpty()) {
            output.add(FEMALE.remove());
        }
        while (!MALE.isEmpty()) {
            output.add(MALE.remove());
        }
        for (Person person : output) {
            System.out.println(person);
        }
    }
}
