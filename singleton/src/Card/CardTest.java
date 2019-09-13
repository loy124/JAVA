package Card;

public class CardTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();

        Card myCard = cardCompany.createCard();
        Card yourCard = cardCompany.createCard();

        System.out.println(myCard.getCardNum());
        System.out.println(yourCard.getCardNum());
    }
}
