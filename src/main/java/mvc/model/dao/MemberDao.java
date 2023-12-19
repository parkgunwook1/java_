package mvc.model.dao;

import mvc.model.vo.Member;

import java.sql.*;
import java.util.ArrayList;

public class MemberDao {
    /*
    * DAO : Controller에게 요청받은 실질적인 기능을 수행하기 위해서 db에 직접 접근 후 sql문을 실행하고 결과값 돌려받음
    *
    * JDBC용 객체
    * - Connection : DB의 연결정보를 담고 있는 객체(IP 주소, PORT 번호)
    * - (Prepared)Statement : 해당 db에 sql문을 전달하고 실행한 후 결과를 받아내는 객체
    * - ResultSet : 내가 실행한 sql문이 select 문일 경우 조회된 결과를 담아두는 객체
    *
    * sql문 전달하면서 쿼리문 실행 : Statement 객체를 이용해서 sql문 실행
    * - select문일 경우 - executeQuery() 메소드 이용해서 실행
    * - 나머지 dml문일 경우 - executeUpdate() 메소드 이용하여 실행
    *
    * 결과 반환
    * - select문일경우 - 결과값은 resultset객체로 받기 (조회된 데이터들이 담겨있음)
    * - 나머지 dml일경우 - int형 변수로 받기(처리된 행의 개수가 담겨있음)
    *
    * ResultSet으로 객체 담긴 데이터들을 하나씩 추출하여 vo 객체로 변환 or 트랜잭션 처리(select가 아닌 dml문일 경우)
    * */

    /**
     * 사용자가 회원추가 요청시 입력했던 값을 가지고 insert 문을 실행하는 메소드
     *
     * @param m : 사용자가 입력했던 아이디 ~ 취미까지의 값이 담겨있는 Member 객체2
     * @return : insert문으로 실행한 결과 처리된 행의 갯수
     */
    public int insertMember(Member m) {
//		INSERT 문, 처리된 행의 갯수, 트랜잭션 처리

//		0) 필요한 변수들 세팅
        int result = 0; // 처리도니 결과를 담아줄 변수(처리된 행의 갯수)
        Connection conn = null; // 접속된 db의 연결정보를 담는 변수
        Statement stmt = null; // SQL문 실행 후 결과를 받기 위한 변수

//		실행할 SQL문 필요(주의점 : 끝에 세미콜론이 있으면 안됨)
        String sql = "INSERT INTO MEMBER VALUES(" + "SEQ_USERNO.NEXTVAL," + "'" + m.getUserId() + "'," + "'"
                + m.getUserPwd() + "'," + "'" + m.getUserName() + "'," + "'" + m.getGender() + "'," + "'" + m.getAge()
                + "'," + "'" + m.getEmail() + "'," + "'" + m.getPhone() + "'," + "'" + m.getAddress() + "'," + "'"
                + m.getHobby() + "'," + "DEFAULT" + ")";

        try {
//			1) JDBC 드라이버 등록
            Class.forName("oracle.jdbc.driver.OracleDriver");
//			오타 or ojdbc6.jar이 누락된 경우 에러발생할 수 있다

//			2) Connection 객체 생성
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");

//			3) Statement 객체 생성
            stmt = conn.createStatement();

//			4, 5) DB에 SQL문 전달하면서 실행 후 결과 받기
            result = stmt.executeUpdate(sql);

//			6_2) 트랜잭션 처리
            if (result > 0) { // 한개 이상의 행이 insert 됨 --> 성공적으로 1행 이상이 삽입 => 커밋
                conn.commit();
            } else {
                conn.rollback();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//		8) 결과 반환
        return result;
    }

    /**
     * 사용자가 회원 전체 조회 요청시 select 문을 실행해주는 메소드
     *
     * @return
     */
    public ArrayList<Member> selectAll() {
//		0) 필요한 변수들 세팅
//		조회한 결과를 담아줄 변수 => ArrayList
        ArrayList<Member> list = new ArrayList<Member>();

//		Connection, Statement, ResultSet
        Connection conn = null; // 접속된 db의 연결정보를 담는 변
        Statement stmt = null; // sql문 실행 후 결과를 받기위한 변수
        ResultSet rset = null; // SELECT 문이 실행딘 조회 결과값들이 담겨질 객체
//		finally에서 자원 반납하기 위해 try전에 세팅
        String sql = "SELECT * FROM MEMBER";
        try {
//			1) JDBC 드라이버 등록
            Class.forName("oracle.jdbc.driver.OracleDriver");

//			2) Connection 객체 생성
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");

//			3) Statement 객체 생성
            stmt = conn.createStatement();

//			4, 5) sql문 전달 후 실행결과 받기
            rset = stmt.executeQuery(sql);

//			6_1) 현재 조회결과가 담긴 ResultSet에서 한행씩 뽑아서 VO객체에 담기
//			rset.next() : 커서를 한줄 아래로 옮겨주고(다음 행) 해당 행이 존재 할경우 true, 아니면 falus를 반환함
            while (rset.next()) {
//				현재 rset의 커서가 가리키고 있는 행에 데이터가 있다면 반복을 진행
                Member m = new Member();
                /*
                 * rset으로 부터 어떤 컬럼에 해당하는 값을 뽑을건지 제시 => 컬럼명, 컬럼 순번 권장사항 : 컬럼명으로 작성하고, 대문자로 쓰는 것을
                 * 권장함
                 *
                 * rset.getInt(컬럼명 또는 컬럼 순번) rset.getString(컬럼명 또는 컬럼 순번) rset.getDate(컬럼명 또는 컬럼
                 * 순번)
                 */
                m.setUserNo(rset.getInt("USERNO"));
                m.setUserId(rset.getString("USERID"));
                m.setUserPwd(rset.getInt("USERPWD"));
                m.setUserName(rset.getString("USERNAME"));
                m.setGender(rset.getString("GENDER").charAt(0));
                m.setAge(rset.getInt("age")); // 대소문자 구뷴하지 않음
                m.setAge(rset.getInt("age")); // 대소문자 구뷴하지 않음
                m.setEmail(rset.getString("EMAIL"));
                m.setPhone(rset.getString(8));
                m.setAddress(rset.getString(9)); // 컬럼의 순번 제시 가능
                m.setHobby(rset.getString(10));
                m.setEnrollDate(rset.getDate(11));
//				한 행에 대한 모든 컬럼의 데이터값들을
//				각각의 필드에 담아 하나의 Member 객체에 옮겨담기 끝
//				리스트에 해당 Member 객체를 담아주면됨
                list.add(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//		8) 결과 반환(조회 결과들이 뽑혀서 담겨있는 list
        return list;
    }

    public Member selectByUserId(String userId) {
//		0) 필요한 변수들 세팅
//		조회된 한 회원에 대한 정보를 담을 변수
        Member m = null;

//		jdbc 관련 객체 선언
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

//		실행할 sql문(완성된 형태로 제시)
        String sql = "SELECT * FROM MEMBER WHERE USERID = '" + userId + "'";
        try {
//			1) JDBC 드라이버 등록
            Class.forName("oracle.jdbc.driver.OracleDriver");

//			2) Connection 객체 생성
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");

//			3) Statement 객체 생성
            stmt = conn.createStatement();

//			4, 5) sql문 전달 후 실행결과 받기
            rset = stmt.executeQuery(sql);

//			6_1) 현재 조회결과가 담긴 ResultSet에서 한 행씩 뽑아 vo 객체에 담기
            if (rset.next()) {
                m = new Member();

                m.setUserNo(rset.getInt("USERNO"));
                m.setUserId(rset.getString("USERID"));
                m.setUserPwd(rset.getInt("USERPWD"));
                m.setUserName(rset.getString("USERNAME"));
                m.setGender(rset.getString("GENDER").charAt(0));
                m.setAge(rset.getInt("age")); // 대소문자 구뷴하지 않음
                m.setAge(rset.getInt("age")); // 대소문자 구뷴하지 않음
                m.setEmail(rset.getString("EMAIL"));
                m.setPhone(rset.getString(8));
                m.setAddress(rset.getString(9)); // 컬럼의 순번 제시 가능
                m.setHobby(rset.getString(10));
                m.setEnrollDate(rset.getDate(11));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//			7) 다쓴 JDBC용 객체 반납(생성된 순서의 순서의 역순)
            try {
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return m;
    }

    public ArrayList<Member> selectByUserName(String keyword) {
        ArrayList<Member> list = new ArrayList<Member>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE '%" + keyword + "%'";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql);

            while (rset.next()) {
                Member m = new Member();
                m.setUserNo(rset.getInt("USERNO"));
                m.setUserId(rset.getString("USERID"));
                m.setUserPwd(rset.getInt("USERPWD"));
                m.setUserName(rset.getString("USERNAME"));
                m.setGender(rset.getString("GENDER").charAt(0));
                m.setAge(rset.getInt("age"));
                m.setAge(rset.getInt("age"));
                m.setEmail(rset.getString("EMAIL"));
                m.setPhone(rset.getString(8));
                m.setAddress(rset.getString(9));
                m.setHobby(rset.getString(10));
                m.setEnrollDate(rset.getDate(11));

                list.add(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public int updateMember(Member m) {
//		0)
        int result = 0;

        Connection conn = null;
        Statement stmt = null;
        String sql = "UPDATE MEMBER "
                + "SET USERPWD = '" + m.getUserPwd() + "', "
                + "EMAIL = '" + m.getEmail() + "', "
                + "PHONE = '" + m.getPhone() + "', "
                + "ADDRESS = '" + m.getAddress() + "' "
                + "WHERE USERID = '" + m.getUserId() + "'";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);

//			6)
            if(result > 0) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public int deleteMember(String userId) {
        int result = 0;

        Connection conn = null;
        Statement stmt = null;
        String sql = "DELETE MEMBER "
                + "WHERE USERID = '" + userId + "'";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);

//			6)
            if(result > 0) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
