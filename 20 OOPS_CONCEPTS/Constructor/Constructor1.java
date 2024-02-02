package Constructor;

public class Constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "rajyadav";
        s1.rollno = 123;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        // copy contructor
        Student s2 = new Student(s1); // S1 ki saree prop. s2 me copy ho rhi hn
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // 100, 99, 100
        }
        System.out.println(s2.name); // rajyadav
        System.out.println(s2.rollno); // 123

        // Student s2 = new Student("Rajyadav");
        // Student s3 = new Student(123);

        // System.out.println(s1.);
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // shallow copy contructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks;
    // }

    // Deep copy contructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Non- Parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("This is a constructor.....");
    }

    // Parameterized constructor
    Student(String name, int rollno) {
        marks = new int[3];
        this.name = name;
        System.out.println(name);
    }

    Student(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }
}
