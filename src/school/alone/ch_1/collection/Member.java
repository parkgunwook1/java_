package school.alone.ch_1.collection;

public class Member implements Comparable<Member>{
    // private 변수로 선언하고 get, set 메서드를 public 으로 제공
    // 나중에 회원 정보를 출력하기 위해 toString 메서드 재정의
    private  int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
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
        return memberName + "회원님의 아이디는" + memberId + "입니다."; // toString 재정의
    }

    public int compareTo(Member member) {  // compareTo() 메서드 재정의. 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교함.
        return (this.memberId - member.memberId);
    }
}
