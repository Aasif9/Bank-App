import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Select your bank account");
        String bankName=sc.next();
        if(bankName.equals("SBI")) {
            System.out.println("Enter your name ,password,balance to create an account");

            String name = sc.next();
            String password = sc.next();
            double balance = sc.nextDouble();

            SBIUser user = new SBIUser(name, balance, password);

            String message = user.addMoney(25000);
            System.out.println(message);

            //withdraw money
            System.out.println("Enter amount you want to withdraw");

            int money = sc.nextInt();

            System.out.println("Enter your password");

            String pass = sc.next();

            System.out.println(user.withdrawMoney(money, pass));

            //rate of interest
            System.out.println(user.calculateInterest(10));
        }
        else if(bankName.equals("HSBC")){
            System.out.println("Enter your name ,password,initial");

            String name = sc.next();
            String password = sc.next();
            double balance = sc.nextDouble();

            HSBCUser user = new HSBCUser(name, balance, password);

            String message = user.addMoney(15000);
            System.out.println(message);

            //withdraw money
            System.out.println("Enter amount you want to withdraw");

            int money = sc.nextInt();

            System.out.println("Enter your password");

            String pass = sc.next();

            System.out.println(user.withdrawMoney(money, pass));

            //rate of interest
            System.out.println(user.calculateInterest(8));
        }
        else{
            System.out.println("Bank Name doesn't exist");
        }
    }
}