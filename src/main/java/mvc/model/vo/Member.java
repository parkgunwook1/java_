package mvc.model.vo;

import java.util.Date;

public class Member {

    private int userNo;
    private String userId;
    private int userPwd;
    private String userName;
    private char gender;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String hobby;
    private Date enrollDate;

    //	클래스 내부에 빌더라는 이름의 클래스 생성(이너클래스)
    /*
     * 빌더를 이용시 장점
     * 1. 불필요한 생성자 제거
     * 2. 데이터의 순서외 상관없이 객체 생성이 가능하다
     * 3. 명시적으로 메소드명을 선언하여 가독성이 좋음
     * 4. 각 인자가 어떤 데이터인지 즉시 확인 가능
     * 5. setter 함수를 만들지 않으므로 객체 일관성이 유지된다
     */
    public static class Builder {
        private int userNo;
        private String userId;
        private int userPwd;
        private String userName;
        private char gender;
        private int age;
        private String email;
        private String phone;
        private String address;
        private String hobby;
        private Date enrollDate;

        //		필수 변수는 생성자에 값을 넣어줌
        public Builder(int userNo) {
            super();
            this.userNo = userNo;
        }

        //		필드별로 메소드 만든 후, 반환값으로 빌더 객체를 리턴
        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;    // 현재 빌더 객체를 반환, 메서드 체이닝 가능
        }

        public Builder setUserPwd(int userPwd) {
            this.userPwd = userPwd;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setGender(char gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Builder setEnrollDate(Date enrollDate) {
            this.enrollDate = enrollDate;
            return this;
        }

        //		빌더 메소드
        public Member build() {
            Member m = new Member();
            m.userNo = userNo;
            m.userId = userId;
            m.userPwd = userPwd;
            m.userName = userName;
            m.age = age;
            m.address = address;
            m.email = email;
            m.gender = gender;
            m.hobby = hobby;
            m.phone = phone;
            m.enrollDate = enrollDate;

            return m;
        }
    }

    @Override
    public String toString() {
        return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
                + ", gender=" + gender + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address="
                + address + ", hobby=" + hobby + ", enrollDate=" + enrollDate + "]";
    }

    public int getUserNo() {
        return userNo;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserPwd() {
        return userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getHobby() {
        return hobby;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }
}