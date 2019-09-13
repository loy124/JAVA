public class testHuman {
    public static void main(String[] args) {
        Human man = new Human();
//        man.age=30;
        man.married = false;
        man.name = "제임스";
        man.son = 5;
//        System.out.println("나이"+ man.age+" 결혼여부 "+ man.married+" 이름 "+ man.name+ " 자녀 수"+man.son);

        Human man1 = new Human(24, "온유");
//        man1.age=30;
        man1.married = false;
        man1.name = "제임스";
//        man1.son = 5;
        System.out.println("나이"+" 결혼여부 "+ man1.married+" 이름 "+ man1.name+ " 자녀 수"+man1.son);
    }
}
