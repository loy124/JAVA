package collection.TreeSet;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {}
    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + " 회원님의 아이디는" + memberId + " 입니다";
    }


    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj; //다운캐스팅
            return (this.memberId == member.memberId);
        }
        return false;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId); //this.memberId - member.memberId와 유사
        //Comparator의 경우 TreeSet 초기화할때 new Member을 붙여주어야한다
    }

//    Comparable을 더 많이 사용하나 이미 구현된 경우 Comparator을 이용하여 다른 정렬방식을 정의
//    @Override
//    public int compareTo(Member member) {
//
////        return (this.memberId - member.memberId) * -1; //양수일경우 오름차순
//        //이름으로 정렬하고싶은 경우
//        return this.memberName.compareTo(member.getMemberName());
//    }

}
