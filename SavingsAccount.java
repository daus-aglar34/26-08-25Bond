public class SavingsAccount {

    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int x) {
        balance += x;
    }

    public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
    }

    public void withdraw(int x) {
        if (x <= balance) {
            balance -= x;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }



    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}