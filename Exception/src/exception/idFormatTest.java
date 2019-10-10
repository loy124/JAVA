package exception;

public class idFormatTest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws idFormatException { //사용하는쪽으로 넘긴다
        if(userId == null){
            throw new idFormatException("아이디는 null 일수 없습니다");
        } else if(userId.length() <8 || userId.length() >20) {
            throw new idFormatException("아이디는 8자에서 20자 사이로 작성하세요");
        }

        this.userId = userId;
    }

    public static void main(String[] args) {
        idFormatTest idFormatTest = new idFormatTest();

        String myId = null;
        try {
            idFormatTest.setUserId(myId);
        } catch (idFormatException e) {
            System.out.println(e);
        }

        myId = "123456";
        try {
            idFormatTest.setUserId(myId);
        } catch (idFormatException e) {
            System.out.println(e);
        }
    }
}
