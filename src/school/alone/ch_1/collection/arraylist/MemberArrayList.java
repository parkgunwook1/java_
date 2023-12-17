package school.alone.ch_1.collection.arraylist;

import school.alone.ch_1.collection.Member;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); // member 형으로 선언한 arraylist 생성
    }
    public void addMember(Member member) { // 회원 추가하는 메서드
        arrayList.add(member);
    }
    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);  // get 메서드로 회원을 순차적으로 가져옴
            int tempId= member.getMemberId();
            if (tempId == memberId) {   // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i);    // 해당 회원을 삭제
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다."); // 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
        return false;
    }
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
