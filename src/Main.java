import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password and balance to create an account");
        // to create user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);

        //add amount
        String message = user.addMoney(10000);
        System.out.println(message);


        //withdraw money
        System.out.println("Enter Amount You Want To Withdraw");
        int money = sc.nextInt();
        System.out.println("Enter Your Password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        // rate of interest
        System.out.println(user.calculateInterest(10));

    }
}