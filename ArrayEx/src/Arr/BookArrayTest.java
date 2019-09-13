package Arr;

public class BookArrayTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        //책이 5권이 생긴게 아닌 배열이 생긴것

        library[0] = new Book("메이플1", "메이플저자");
        library[1] = new Book("게임1", "게임저자");
        library[2] = new Book("게임2", "게임저자");
        library[3] = new Book("게임3", "게임저자");
        library[4] = new Book("게임4", "게임저자");

        for(int i = 0; i <library.length; i++ ){
            System.out.println(library[i]);
           library[i].showBookInfo();
        }
    }
}
