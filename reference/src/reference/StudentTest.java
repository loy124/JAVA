package reference;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student(1234,"온유");
        student.setKoreaSubject("국어",20);
        student.setMathSubject("굶어",24);
        student.setScienceSubject("과학", 50);
        student.showStudentScore();
        Student student1 = new Student(101, "kim");
        student1.setKoreaSubject("국어",60);
        student1.setMathSubject("굶어",44);

        student1.showStudentScore();
//        student1.showStudentavg();

    }
}
