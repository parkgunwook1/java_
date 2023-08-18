package project;

public class UserLogin {
    private String id;
    private String password;
    private String role;

    public UserLogin(String role) {
        String[] data = null;

        UserData userData = UserData.getInstance();

        if(role.equals("a")) {
            data = userData.getAdminData();
        }else if(role.equals("u")){
            data = userData.getUserData();
        }

        this.id = data[0];
        this.password = data[1];
        this.role = data[2];
    }
    boolean isLogin(String id, String password, String role) {

        boolean rs = false;

        if(id.equals(this.id)) {
            if(password.equals(this.password)) {
                System.out.printf("Welcom !! %s %s ", this.role, id  );
                rs = true;
            }else {
                System.out.println("Login Fail - step 3");
            }
        }else {
            System.out.println("Login Fail - step 2");
        }

        return rs;
    }
}
