package Date;

import Date.MyDate;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();

        date.setYear(2019);
        date.setMonth(7);
        date.setDay(10);

        date.showDate();

        MyDate date1 = new MyDate();
        date1.setYear(2019);
        date1.setMonth(7);
        date1.setDay(20);
        date1.showDate();
    }

}
