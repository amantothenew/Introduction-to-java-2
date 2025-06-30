// Q5) Write a program to show application of Singleton Design Pattern.

public class Student {
    private static Student student;

    private Student() {

    }

    public static Student getSingleInstance() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
}
