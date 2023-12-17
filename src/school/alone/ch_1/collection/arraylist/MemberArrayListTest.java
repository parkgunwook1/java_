package school.alone.ch_1.collection.arraylist;

import school.alone.ch_1.collection.Member;

public class MemberArrayListTest {

    // 멀티 스레드 환경이 아닌 경우에는 ArrayList 를 사용하도록 권장한다

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001,"이지원");  // 새로원 회원 인스턴스 생성
        Member memberSon = new Member(1002,"박건욱");
        Member memberHong = new Member(1003,"홍길동");
        Member memberGo = new Member(1004,"고길동");

        memberArrayList.addMember(memberLee); // ArrayList 에 회원추가
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberHong);
        memberArrayList.addMember(memberGo);

        memberArrayList.showAllMember(); // 전체 회원 출력



        memberArrayList.removeMember(memberHong.getMemberId()); // 홍길동 회원 삭제

        System.out.println("---------- 홍길동 삭제 ---------");
        memberArrayList.showAllMember(); // 삭제 후 전체 출력
    }
}
