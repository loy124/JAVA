package reference;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;
    Subject science;

    public Student(int id, String name){
        studentId = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
        science = new Subject();
    }

    public void setKoreaSubject(String subject, int score) {
        korea.subject = subject;
        korea.score = score;
    }

    public void setMathSubject(String subject, int score) {
        math.subject = subject;
        math.score = score;
    }

    public void setScienceSubject(String subject, int score) {
        science.subject = subject;
        science.score = score;
    }

    public void showStudentScore(){
        int total = korea.score + math.score + science.score;
        System.out.println("과목의 총 점은 " + total + " 입니다");
    }
}
