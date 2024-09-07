
import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

class student1 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);
System.out.print("Name of the  student:");
        s.name = scanner.next();
        System.out.print("Age of the strudent:");
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}
