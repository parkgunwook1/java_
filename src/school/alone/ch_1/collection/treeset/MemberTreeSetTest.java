package school.alone.ch_1.collection.treeset;

import school.alone.ch_1.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003,"박서우");
        Member memberKim = new Member(1001,"김진우");
        Member memberBack = new Member(1004,"백소이");

        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberBack);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003,"홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

    }
}
