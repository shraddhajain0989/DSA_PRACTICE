class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
            System.out.println("Initial balance can't be nagative Set to 0.");
        }
    }
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited  " +amount);
        }else{
             System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw : " +amount);
        }else if (amount > balance){
            System.out.print("Insufficient Balance !");
        }else {
            System.out.println("Withdraw amount will be positive");
        }
    }
    public double getBalance(){
        return balance;
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount acc =  new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("FInal Balance : " +acc.getBalance());
    }
}