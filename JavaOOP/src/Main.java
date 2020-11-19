
import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jackie",22,"Female","20430885");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("ID NO: " + student.getIDNo());
    }
}
