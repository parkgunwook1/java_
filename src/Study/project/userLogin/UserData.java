package Study.project.userLogin;

public class UserData {
    private String[] adminData;
    private String[] userData;

    private static UserData instance = new UserData();

    private UserData() {
        adminData = new String[2];
        adminData[0] = "root";
        adminData[1] = "1111";
        adminData[2] = "admin";

        userData = new String[2];
        userData[0] = "hong";
        userData[1] = "2222";
        userData[2] = "user";
    }

    public static UserData getInstance() {
        return instance;
    }
    public String[] getAdminData() {
        return adminData;
    }
    public String[] getUserData() {
        return userData;
    }
}
