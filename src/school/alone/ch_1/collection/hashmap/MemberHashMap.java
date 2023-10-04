package school.alone.ch_1.collection.hashmap;

import school.alone.ch_1.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    // key-value 쌍으로 이루어진 객체이고 key 값은 유일하며 value 값은 중복될 수 있다.
    // Map 인터페이스를 구현한 클래스는 내부적으로 해시 알고리즘에 의해 구현되어 있다.
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    public void addMember(Member member) {// key- value 쌍으로 추가
        hashMap.put(member.getMemberId(), member);
    }
    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
