package ArrayList;

import java.util.ArrayList;

public class Student {
 String studentName;

 private ArrayList<Subject> subjects;

 public Student(String studentName){
     this.studentName = studentName;
     subjects = new ArrayList<Subject>();
 }

 public void addSubjects(String name, int score){
     Subject subject = new Subject(name, score);

     subjects.add(subject);
 }

 public void showStudentInfo(){
     int total = 0;
     for( Subject subject : subjects){
         total += subject.getScore();
         System.out.printf("%s 학생의 %s의 성적은 %d 입니다\n",
                 studentName, subject.getSubjectName(), subject.getScore());
     }
     System.out.println(total);
 }

}
