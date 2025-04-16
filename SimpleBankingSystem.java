import java.util.ArrayList;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double rate) {
        balance = initialBalance;
        interestRate = rate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double limit) {
        balance = initialBalance;
        overdraftLimit = limit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class SimpleBankingSystem {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");
        Bank bank = new Bank();
        
        SavingsAccount savings = new SavingsAccount(1000, 2.5);
        CurrentAccount current = new CurrentAccount(2000, 500);
        
        bank.addAccount(savings);
        bank.addAccount(current);
        
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        
        current.deposit(1000);
        current.withdraw(2500);
        
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Current balance: " + current.getBalance());
    }
}
