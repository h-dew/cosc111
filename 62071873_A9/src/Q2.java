public class Q2 {
    public static void main(String[] args){
        BankAccount account0 = new BankAccount(6.7, 33000);
        account0.withdraw(1500);
        account0.deposit(1000);
        account0.displayInfo();
    }

    static class BankAccount {
        private int id;
        private double balance;
        private double annualInterestRate;
        private static int count;

        public BankAccount(double annualInterestRate, double balance) {
            this.id = count++;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }

        public BankAccount() {
            this(0, 0);
        }
        
        public double getBalance() {
            return balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public double getId() {
            return id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate() / 100;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void displayInfo() {
            System.out.println("\t" + "ID: " + id);
            System.out.println("\t" + "Balance: $" + balance);
            System.out.println("\t" + "Annual Interest Rate: " + annualInterestRate + "%");
            System.out.println("\t" + "Monthly Interest Rate: " + getMonthlyInterestRate() + "%");
            System.out.println("\t" + "Monthly Interest: $" + getMonthlyInterest());
        }
    }
}
