class BankAccount {
    void deposit() {
        System.out.println("Deposit in BankAccount");
    }
    
    void withdraw() {
        System.out.println("Withdraw from BankAccount");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Withdraw from SavingsAccount (limit:₹5000000)");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Withdraw from CheckingAccount (fee:₹10000)");
    }
}

class TestAccount {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        SavingsAccount s1 = new SavingsAccount();
        s1.deposit();
        s1.withdraw();
        
        CheckingAccount c1 = new CheckingAccount();
        c1.deposit();
        c1.withdraw();
    }
}
