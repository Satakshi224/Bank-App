import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name,password,balance to create account");
        String name =sc.next();
        String password=sc.next();
        Double balance= sc.nextDouble();
        SBIUser user = new SBIUser(name,password,balance);
         String message=user.AddMoney(10000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter Amount to withdraw");
        int money= sc.nextInt();
        System.out.println("Enter your password");
        String pass= sc.next();
        System.out.println(user.WithdrawMoney(money,pass));


        //rate of interest
        System.out.println(user.CalculateInterest(10));





    }
}