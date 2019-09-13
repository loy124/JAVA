public class Student {

        public int studentID;
        public String studentName;
        public String address;

        public void showStudentInfo() {
            System.out.println(studentName + ", " + address);
        }

        public String getStudentName() {
                return studentName;
        }
        int add(int num1, int num2){
                int result;
                result = num1 + num2;
                System.out.println(result);
                return result;
        }

}
