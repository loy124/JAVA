public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.address="태전동";
        student.studentID=20120860;
        student.studentName ="이온유";
        student.showStudentInfo();
        student.add(1, 2);

       String x = student.getStudentName();
        System.out.println(student.getStudentName());

        Student student1 = new Student();

        student1.studentName = "이이이";
        System.out.println(student1.getStudentName());
        System.out.println(student );
        System.out.println(student1 );
    }
}
