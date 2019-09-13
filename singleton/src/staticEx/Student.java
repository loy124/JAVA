package staticEx;

public class Student {

    private static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String address;

    public Student(String name){
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
        serialNum++;
        studentID = serialNum;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        int i = 0;
//        static 메소드 안에서는 인스턴스를 사용할수 없다.
//        인스턴스와 상관없이 호출되기 떄문에
//        studentName = "Lee";

        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
