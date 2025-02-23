import java.util.Scanner;

class Student {
    String name;
    int rollN;

    public Student(String name, int rollN) {
        this.name = name;
        this.rollN = rollN;
    }

   
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollN);
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter roll number:");
            int rollN = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Creating Student object with provided data
            students[i] = new Student(name, rollN);
        }


        System.out.println("\nStudent Data:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Details of Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
        }

        scanner.close();
    }
}