package collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) *(-1); //내림차순 변경
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); //new MyCompare을 넣을경우 위 클래스의 역순으로 정렬된다.
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for ( String str : treeSet) {
            System.out.println(str);
        }
    }
}
