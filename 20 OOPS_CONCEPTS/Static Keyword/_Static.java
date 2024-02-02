
public class _Static {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.SchoolName = "NBM";

        // Student s2 = new Student();
        // // s2.SchoolName = "ABC";
        // System.out.println(s2.SchoolName);

        // Student s3 = new Student();
        // s3.SchoolName = "ABC";
        // System.out.println(s3.SchoolName);

    }
}

class Student {
    String name;
    int rollno;

    static String SchoolName;

    void setName(String NewName) {
        this.name = NewName;

    }

    String getName() {
        return this.name;
    }
}
