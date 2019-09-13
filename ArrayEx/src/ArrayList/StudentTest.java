package ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student("LEE");
            lee.addSubjects("국어", 100);
            lee.addSubjects("수학", 90);
            lee.showStudentInfo();
        Student kim = new Student("KIM");
            kim.addSubjects("국어", 100);
            kim.addSubjects("수학", 90);
            kim.addSubjects("영어", 80);
            kim.showStudentInfo();
    }



}
