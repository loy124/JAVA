package exception;

public class AutoCloseTest {
    public static void main(String[] args) {


        try(AutoCloseObject obj = new AutoCloseObject()){
            throw new Exception();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
