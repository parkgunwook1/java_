package study.project1.userLogin;

import java.util.Scanner;

public class UserLoginMain {
    public static void main(String[] args) {

        String id = "";
        String password = "";
        String role = "";
        boolean rs = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("User Login Service");
        System.out.println("Admin or User? (a|u) > ");
        role = sc.next();
        System.out.println("Id? > ");
        id = sc.next();
        System.out.println("Password? > ");
        password = sc.next();

        if(role.equals("a") || role.equals("u")) {

            UserLogin login = new UserLogin(role);

            rs = login.isLogin(id, password, role);
            System.out.println("Login1 : " + rs);

        }else {
            System.out.println("Login Fail - step 1");
        }

        sc.close();

    }
}
