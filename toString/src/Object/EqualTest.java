package Object;

class Student{
    int studentNumber;
    String studentName;

    public Student(int studentNumber, String studentName){
        studentNumber = this.studentNumber;
        studentName = this.studentName;
    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    @Override
    public int hashCode() {
        return  studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Student) {
            Student std = (Student)obj; //다운캐스팅 명시적
//            return (this.studentNumber == std.studentNumber);
            if(this.studentNumber == std.studentNumber) {
                return true;
            } else return false;
        }
        return false;
    }
}

public class EqualTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이순신");
        Student studentLee2 = studentLee;
        Student studentKim = new Student(100, "이순신");

        System.out.println(studentLee == studentKim);
        System.out.println(studentLee.equals(studentKim));

        System.out.println(studentLee);
        System.out.println(studentLee.hashCode()); //10진수
        System.out.println(studentKim.hashCode()); //10진수

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1)); // 실제 객체의 해시코드
        System.out.println(System.identityHashCode(i2)); // 실제 객체의 해시코드

    }
}
