package exception;

public class AutoCloseObject implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close() 가 호출 되었습니다.");
    }
}
