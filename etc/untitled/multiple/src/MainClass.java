//구구단을 출력할때 짝수 단만 출력하면서 다보다 곱하는 수가 작거나 같을 때까지만 출력하세요

public class MainClass {
    public static void main(String[] args) {
        for(int i = 1; i<10; i++){
            if(i %2 != 0 ) continue;
            for(int j = 1; j<10; j++){
                if ( j > i) break;

                System.out.printf("%d * %d = %d\n", i, j, i*j);
//               if(i %2 == 0 && j <=i){
//                   System.out.printf("%d * %d = %d\n", i, j, i*j);
//               }

            }
        }
    }
}
