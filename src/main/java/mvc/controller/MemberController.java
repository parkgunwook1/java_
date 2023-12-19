package mvc.controller;

import mvc.model.dao.MemberDao;
import mvc.model.view.MemberView;
import mvc.model.vo.Member;

import java.util.ArrayList;

public class MemberController {
    /*
    * Controller : View를 통해서 들어온 요청을 담당
    * - 해당 메소드로 전달된 데이터들을 가공처리한 후 Dao 메소드 호출시 전달한다.
    * - Dao로부터 반환받은 결과에 따라 사용자가 보게될 화면 지정한다.
    * */
    public void insertMember(String userId, int userPwd, String userName, char gender, int age, String email,
                             String phone, String address, String hobby) {
//		1. 전달된 데이터들을 가지고 가공처리하기 => Member 객체로 변환
//		Member m = new Member(userId, userPwd, userName, gender, age, email, phone, address, hobby);
        Member m = new Member.Builder(0).setUserId(userId).setUserPwd(userPwd)
                .setUserName(userName).setGender(gender).setAge(age).setEmail(email)
                .setPhone(phone).setAddress(address).setHobby(hobby).build();

//		2. dao 의 insertMember 메소드 호출
        int result = new MemberDao().insertMember(m);

//		3. 결과값이 1인 경우 성공, 0인 경우 실패
        if (result == 1) {
            System.out.println("회원 추가 성공");
        } else {
            System.out.println("회원 추가 실패");
        }
    }

    public void selectAll() {
//		SELECT * FROM MEMBER;
//		SELECT -> ResultSet -> ArrayList<Member>
        ArrayList<Member> list = new MemberDao().selectAll();

//		조회 결과가 있는지 없는지 판단 후 사용자가 보게될 회면을 지정
        if (list.isEmpty()) {
//			조회된 결과가 없는 상태
            new MemberView().displayNodata("전체 조회결과가 없습니다");
        } else {
//			조회가 되었을 경우
            new MemberView().displayData(list);
        }

    }

    public void selectByUserId(String userId) {
//		SELECT
//		SELECT * FROM MEMBER WHERE USERID = '입력한 값';
//		Member
        Member m = new MemberDao().selectByUserId(userId);

//		조회 결과가 있는지 없는지 판단 후 사용자가 보게될 view 지정
        if (m == null) { // 조회결과가 없는 상태
            new MemberView().displayNodata(userId + "에 해당하는 검색 결과가 없습니다");
        } else { // 조회결과가 있는 상태
            new MemberView().displayOne(m);
        }
    }

    public void selectByUserName(String keyword) {
        ArrayList<Member> list = new MemberDao().selectByUserName(keyword);

        if (list.isEmpty()) {
//			검색 결과가 없을 때
//			displayNodata 함수 호출
            new MemberView().displayNodata("전체 조회결과가 없습니다");
        } else {
//			검색 결과가 있을 때
//			displayData 함수 호출
            new MemberView().displayData(list);
        }
    }

    public void updateMember(String userId, int newPwd, String newEmail, String newPhone, String newAddress) {
//		VO 객체에 입력받은 값들 담기
        Member m = new Member.Builder(0).setUserId(userId).setUserPwd(newPwd).setEmail(newEmail).setPhone(newPhone).setAddress(newAddress).build();

//		가공 VO 객체에 m을 dao 단에 넘기기
        int result = new MemberDao().updateMember(m);

        if(result > 0) {
            System.out.println("회원 정보 변경 성공");
        } else {
            System.out.println("회원 정보 변경 실패");
        }
    }

    /**
     * 사용자가 회원 탈퇴 요청시 처리해주는 메서드
     * @param userId -> 사용자가 입력한 회원의 아이디 값
     */
    public void deleteMember(String userId) {
        int result = new MemberDao().deleteMember(userId);

        if(result > 0) {
//		회원 탈퇴 성공시
//		회원 탈퇴 성공 메세지 출력
            System.out.println("회원 탈퇴 성공");
        } else {
//		회원 탈퇴 실패시
//		회원 탈퇴 실패 메세지 출력
            System.out.println("회원 탈퇴 실패");
        }
    }
}