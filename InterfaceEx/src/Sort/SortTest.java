package Sort;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택하세요");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");

        int ch = System.in.read();
        Sort qSort = null;

        if(ch == 'Q' || ch == 'q'){
            qSort = new QuickSort();
        } else if(ch == 'B' || ch =='b'){
            qSort = new BubbleSort();
        }


        qSort.ascending();
        qSort.descending();
        qSort.description();


    }
}
