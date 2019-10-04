package Object;

class Book implements Cloneable{ //Clone 가능하게 명시
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
    @Override
    public String toString() {
        return author + ", " + title;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
// public  String toString() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class toStringTest{
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지", "박경리");
        System.out.println(book);
        String str = new String("토지");
        System.out.println(str.toString());
        System.out.println(str);

        Book book2 = (Book)book.clone();
        System.out.println(book2);
    }
}
