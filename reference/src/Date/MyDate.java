package Date;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {

        if(month < 1 || month >12){
                isValid = false;
        }
        else{
            isValid = true;
            this.month = month;
        }

    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void showDate() {
        if(isValid == true){
            System.out.println(year + " 년 " + month + " 월 " + day + " 일");
        }
        else{
            System.out.println("유효하지 않은 날짜입니다");
        }


    }
}
