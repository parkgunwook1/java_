package Study.bookstudy.ch3;

public class VendingMachineMain {
    public static void main(String[]args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);
    }
}
