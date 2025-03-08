import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student("Alice", 20, "123 Main St");
        Student student2 = new Student("Bob", 21, "456 Elm St");

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("students.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student1);
            out.writeObject(student2);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in students.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fileIn = new FileInputStream("students.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s1 = (Student) in.readObject();
            Student s2 = (Student) in.readObject();
            in.close();
            fileIn.close();

            // Printing student details
            System.out.println("Student 1 details:");
            System.out.println("Name: " + s1.getName());
            System.out.println("Age: " + s1.getAge());
            System.out.println("Address: " + s1.getAddress());

            System.out.println("\nStudent 2 details:");
            System.out.println("Name: " + s2.getName());
            System.out.println("Age: " + s2.getAge());
            System.out.println("Address: " + s2.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}