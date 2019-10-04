package String;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = new String("abc"); //인스턴스로 생성됨
        String str2 = new String("abc"); //상수풀에 있는 문자열을 가리킴
        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);
        //한번 선언된 String은 불변이다
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java) + " " + System.identityHashCode(android));
       java =  java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java) + " " + System.identityHashCode(android));
//        문자열을 변경하거나 연결하는 경우 사용하면 편리한 클래스
//        StringBuilder 단일쓰레드 동기화
//        StringBuffer 멀티 쓰레드에서도 동기화
//        toString() 메서드로 String 반환
    }
}
