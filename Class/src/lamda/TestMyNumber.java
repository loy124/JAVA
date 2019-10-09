package lamda;

public class TestMyNumber {
    public static void main(String[] args) {

        MyMaxNumber max = (x , y) -> (x >= y) ? x : y;
        System.out.println(max.getMaxNumber(10, 20));
//        MyMaxNumber max = (x , y) -> return { (x >= y) ? x : y} ;
    }
}
