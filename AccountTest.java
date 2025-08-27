public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount();
        sa1.name = "Budi";
        sa1.balance = 1000;
        sa1.interestRate = 0.01;
        sa1.displayCustomer();
        sa1.deposit(500);
        System.out.println("Saldo setelah setor: " + sa1.balance);

        Bond bond1 = new Bond();
        bond1.name = "Andi";
        bond1.balance = 5000;
        bond1.setTermAndRate(12);

        System.out.println("\nSimulasi Obligasi untuk " + bond1.name);
        for (int i = 0; i < 2; i++) {
            bond1.earnInterest();
        }
    }
}
