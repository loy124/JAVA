package serialization;

import java.io.*;

class Person implements Serializable {
//    Externalizable 구현가능한 요소가 있다.
    String name;
//    transient 이 변수는 직렬화 하지 마시오
    transient String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + " ," + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person person = new Person("이순신", "장군");
        Person person1 = new Person("홍길동", "도적");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(person);
            oos.writeObject(person1);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
