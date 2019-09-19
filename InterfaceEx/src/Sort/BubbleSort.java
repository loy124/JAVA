package Sort;

public class BubbleSort implements Sort{
    @Override
    public void ascending() {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending() {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 입니다");
    }
}
