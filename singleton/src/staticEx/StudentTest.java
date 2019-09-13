package staticEx;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("lee");
        System.out.println(Student.getSerialNum());
        System.out.println(student.getStudentID());
        Student student1 = new Student("lee");
        System.out.println(student1.getStudentID());
        System.out.println(student.getStudentID());
//        Student student1 = new Student("kim");
//        System.out.println(Student.serialNum);
//        System.out.println(Student.serialNum);
//        Student student2 = new Student("kim");
//
//        System.out.println(student.getStudentID());
//        System.out.println(student1.getStudentID());
//        System.out.println(student2.getStudentID());
    }
}
