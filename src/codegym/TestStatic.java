package codegym;

public class TestStatic {
    public static void main(String[] args) {
        Student student = new Student(10,"Tuấn");
        Student.change();
        student.display();
    }
}
