package collection.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();
        Member member = new Member(100, "lee");
        Member member1 = new Member(200, "kim");
        Member member2 = new Member(300, "park");

        //멤버에대해서 아이디가 같으면 같은 것이라는것이 정의되지 않았다.
        //Member에서 이퀄과 hashCode 재정의
        manager.addMember(member);
        manager.addMember(member1);
        manager.addMember(member2);

        manager.showAllMember();

        manager.removeMember(100);
        manager.showAllMember();
    }
}
