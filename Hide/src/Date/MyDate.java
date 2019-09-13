package Date;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean valid;

    public void setDay(int day) {
        if(day < 1 || day >31){
            valid =false;
        }
        else {
//            valid =true;
            this.day = day;
        }

    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if(month <1 || month>12){
            valid = false;
        }
        else {
//            valid = true;
            this.month = month;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public MyDate(){

    }

    public MyDate(int day, int month, int year){
        setYear(year);
        setMonth(month);
        setDay(day);

    }
//
//
    public void isValid(){
        if(valid == true){
            System.out.println("유효한 날짜입니다");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다");
        }

    }

    public void showDate(){
        System.out.printf("오늘 날짜는 %d 년 %d 월 %d 일 입니다", year, month, day);
    }
}
