package Arr;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] arr = new int[]{ 1, 2, 3};
//        int[] arr = {1, 2, 3};

//        System.out.println(arr[1]);
        int []arr = new int[10];
        int total = 0;

        for(int i = 0, num = 1; i <arr.length; i++, num++){
            arr[i] = num;
            total += arr[i];
            System.out.println(total);
        }
        System.out.println(total);
//        for(int i= 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //배열이 가득차지 않은 부분은 0으로 초기화된다
        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;
        double mTotal = 1;
        for (int i =0; i< count; i++){
            mTotal *= dArr[i];
        }
        //        for (int i =0; i<dArr.length; i++){
//            mTotal *= dArr[i];
//        }
        System.out.println(mTotal);
    }
}
