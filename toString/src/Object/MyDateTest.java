package Object;

class MyDate {
    int date;
    int month;
    int year;
    public MyDate(int date) {
        date = this.date;

    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate){
            MyDate day = (MyDate)obj;
            if(this.date == day.date){
                return true;
            } else return false;

        }
        return false;
    }

    @Override
    public int hashCode() {
        return date;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(10);
        MyDate myDate2 = new MyDate(10);

        System.out.println(myDate1.equals(myDate2));

    }


}
