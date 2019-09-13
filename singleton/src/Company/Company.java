package Company;

public class Company {
    //싱글톤 패턴
    //내부 생성이니 사용가능
//    private static Company instance = new Company();

//    private Company() {}

//    public static Company getInstance() {
//        if( instance == null){
//            instance = new Company();
//        }
//
//        return instance;
//
//    }

    private  static Company instance = new Company();
    private Company() {}

    //static으로 선언하는이유는 생성자가
    // 하나이상 호출된 후에 실행되야하는 일반메서드기떄문에
    //static으로 선언한다
    public static Company getInstance() {
        return instance;
    }
}
