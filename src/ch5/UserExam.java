package ch5;

public class UserExam {
    public static void main(String[]args) {
        User user = new User("박건욱", "kw85428@naver.com");

//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        System.out.println(user);

        User user1 = new User("구진영","pkw85428","1234");
        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword());
        System.out.println(user1.getName());
        System.out.println(user1);
    }
}
