package collection.TreeMap;

import collection.HashMap.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap; //Integer에 이미 equals hashcode가 구현되어있다

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator(); //모든 Key객체를 반환
//        treeMap.values().iterator(); //모든 값객체로를 반환
        while(ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }

}
