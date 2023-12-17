package school.alone.ch_1.static_var.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance();  //Company를 생성할 수 없으므로 static 으로 제공되는 getInstance() 메서드를 호출.
        Company myCompany2 = Company.getInstance();
        System.out.println(myCompany1 == myCompany2);
    }
}
