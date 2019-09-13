import java.util.Scanner;

public class FunctionTest {

    public static int addNum(int num1, int num2){
        int result;
        result = num1 + num2;
        return  result;
    }
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum(String hello){
        int sum = 0;
        int i = 5;
        int j = 5;
//        for (i=0; i<=100; i++){
//            sum += i;
//        }
//        return sum;
        if(hello == "x"){
            sum = i + j;
        }
        else if(hello == "-"){
            sum = i - j;
        }
        else if(hello == "*"){
            sum = i * j;
        }
         else if(hello == "/"){
            sum = i / j;
        }
        return sum;
    }



    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        //반환값이 있어야 받을수 있다
        int total = addNum(n1, n2);

        sayHello("안녕하세요");

        int num = calcSum("-");

        System.out.println(total);
        System.out.println(num);
    }
}
