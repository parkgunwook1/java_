package school.alone.ch_1.collection.hashmap;

import school.alone.ch_1.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001,"이지원");
        Member memberSon = new Member(1002,"손흥민");
        Member memberPark = new Member(1003,"박건욱");
        Member memberBack = new Member(1004,"백승호");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberBack);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
