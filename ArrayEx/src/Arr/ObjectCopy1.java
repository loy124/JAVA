package Arr;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("메이플1", "메이플저자");
        library[1] = new Book("게임1", "게임저자");
        library[2] = new Book("게임2", "게임저자");
        library[3] = new Book("게임3", "게임저자");
        library[4] = new Book("게임4", "게임저자");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        //깊은 복사
        for( int i = 0; i< library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("반갑다람쥐");
        library[0].setAuthor("다람쥐");
        for( Book book : library){
            book.showBookInfo();
        }
        for( Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
