import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "John", "123 Street A"));
        students.add(new Student(3, "Alice", "456 Street B"));
        students.add(new Student(7, "Bob", "789 Street C"));
        students.add(new Student(2, "David", "321 Street D"));
        students.add(new Student(5, "Cathy", "654 Street E"));
        students.add(new Student(8, "Eva", "987 Street F"));
        students.add(new Student(1, "Frank", "147 Street G"));
        students.add(new Student(6, "Grace", "258 Street H"));
        students.add(new Student(9, "Helen", "369 Street I"));
        students.add(new Student(4, "Ivy", "753 Street J"));

        System.out.println("Original list:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by name
        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number
        SelectionSort.selectionSort(students, new RollnoComparator());
        System.out.println("\nSorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
