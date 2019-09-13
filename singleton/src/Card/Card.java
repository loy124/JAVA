package Card;

public class Card {
    private int cardNum;
    private static int serialNum = 10000;

    Card(){
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }
}

//    private static Company instance = new Company();

//    private Company() {}

//    public static Company getInstance() {
//        if( instance == null){
//            instance = new Company();
//        }
//
//        return instance;
//
//    }