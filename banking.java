class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}

public class banking {
    public static void main(String[] args) {
        System.out.print("enter Account holder Name:");
        java.util.Scanner se=new java.util.Scanner(System.in);
        String name =se.nextLine();
        System.out.print("Enter your password:");
        int PASS =se.nextInt();
        BankAccount bb=new BankAccount(PASS,name);
        int i=0;
        while(i!=4){
            System.out.println("1.Deposit\n2.Withdraw\n3.AccountInfo\n4.Exit\n");
            i=se.nextInt();
            switch(i){
                case 1:
                    System.out.print("Enter the amount to deposit:");
                int dis=se.nextInt();
                bb.deposit(dis);
                break;
                case 2:
                System.out.print("Enter the amount to withdraw:");
                int wit=se.nextInt();
                bb.withdraw(wit);
                break;
                case 3:
                bb.getAccountInfo();
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("INVALIDE!!!!");
            }
        }
        se.close();
    }
}
