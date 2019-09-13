package Date;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setYear(2019);
        date.setMonth(9);
        date.setDay(30);

        date.showDate();
        date.isValid();
    }
}
