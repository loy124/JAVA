package InterfaceEx;

public class CalcTest {
    public static void main(String[] args) {
        Calc completeCalc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(completeCalc.add(n1, n2));
        System.out.println(completeCalc.subtract(n1, n2));
        System.out.println(completeCalc.times(n1, n2));
        System.out.println(completeCalc.divide(n1, n2));

        completeCalc.description();
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
//        completeCalc.showInfo();

    }
}
