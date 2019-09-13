package ArrayListBook;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student("LEE");
        lee.addBook("태백산맥1");
        lee.addBook("태백산백2");
        lee.getBookLists();

        Student cho = new Student("Cho");
        for(int i = 0; i< 6; i++){
            cho.addBook("해리포터 " + (i + 1));
        }
        cho.getBookLists();
    }

}
