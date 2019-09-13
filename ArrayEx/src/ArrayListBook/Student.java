package ArrayListBook;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Book> list;

    public Student(String name){
        this.name = name;
        list = new ArrayList<Book>();
    }
    public void addBook(String title){
        Book book = new Book(title);
        list.add(book);
    }
    public void getBookLists(){
        System.out.print(name + " 학생이 " + "읽은 책은 ");
        for(Book book : list){
            System.out.print(book.getTitle() + " ");
        }
        System.out.print("입니다\n");
    }
}
