package Arr;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("메이플1", "메이플저자");
        library[1] = new Book("게임1", "게임저자");
        library[2] = new Book("게임2", "게임저자");
        library[3] = new Book("게임3", "게임저자");
        library[4] = new Book("게임4", "게임저자");
        System.arraycopy(library, 0, copyLibrary, 0, 5); //얕은 복사
        //향상된 for문 전체를 돈다;
//        for( Book book : copyLibrary){
//            book.showBookInfo();
//        }
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
