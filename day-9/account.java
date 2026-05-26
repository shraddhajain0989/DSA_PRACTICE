import java.util.Scanner;
abstract class payment{
    abstract void pay();
    double amount;
    void amount(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter amount to pay: ");
       amount = sc.nextDouble();
    }
}
class credit_card extends payment{
    void pay(){
        System.out.println("Paid " + amount + " using credit card");
    }
}
class paypal extends payment{
    void pay(){
        System.out.println("Paid " + amount + " using PayPal");
    }
}
public class account {
    public static void main(String[] args) {
        credit_card cc = new credit_card();
        cc.amount();
        cc.pay();
        paypal pp = new paypal();
        pp.amount();
        pp.pay();
     }
}
