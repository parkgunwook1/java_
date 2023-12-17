package school.ch1.together.study.ch9_object.abstraction.model;

public class Member {
    private String memberId;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String phone;
    String email;

    public Member() {

    }
    public void changeName(String name) {
        this.memberName = name;
    }
    public String printName(){
        return memberName;
    }
}
