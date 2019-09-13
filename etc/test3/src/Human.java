public class Human {
   private int age;
    String name;
    boolean married;
    int son;
    public Human() {}

//    public Human(int a, String n) {
//        System.out.println("호출되엇따");
//        age = a;
//        name = n;
//        System.out.println("나이 "+ a + " 이름"+ n);
//        son = 0;
//    }
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void getHuman(int age, String name, boolean married, int son) {
        System.out.println("나이" + age);
        System.out.println("이름" + name);
        System.out.println("결혼여부" + married);
        System.out.println("자녀 수" + son);
    }
}
