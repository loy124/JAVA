public class MainClass {
    public static void main(String[] args) {

//        for(int i =1; i<10; i++){
//            for(int j = 1; j < 10; j++){
//                System.out.printf("%d * %d = %d", i, j, i*j);
//                System.out.println();
//            }
//        }
        int i = 1;
        int j = 1;
        while (i <= 9 ){
            while(j <=9){
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println();
                j++;
            }
            i++;
            j=1;
        }
    }
}
