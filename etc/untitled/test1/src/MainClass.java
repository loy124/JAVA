public class MainClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int result = 0;
        char operator = '+';
//        if(operator == '+'){
//            result = i + j;
//        }
//        else if(operator == '-'){
//            result = i - j;
//        }
//        else if(operator == '*'){
//            result = i * j;
//        }
//        else if(operator == '/'){
//            result = i / j;
//        }
        switch (operator){
            case '+':
                result = i + j;
            case '-':
                result = i - j;
            case '*':
                result = i * j;
            case '/':
                result = i / j;
        }
        System.out.printf("%d %c %d = %d", i, operator, j, result);

    }
}
