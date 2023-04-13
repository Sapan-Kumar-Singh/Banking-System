import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Let's create Bank Application!!");
        System.out.printf("Enter User Name :");
        String name=sc.nextLine();
        System.out.printf("Enter user Password :");
        String password=sc.next();
        System.out.printf("Enter Amount to Deposit:");
        double money= sc.nextDouble();;

        Bank sbiBankAccount=new SBIBank(name, password,money);

        while(true)
        {
            System.out.println("Select Your choice ");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. check Balance");
            System.out.println("4. Get Rate of interest");
            System.out.println("5. Get total Interest");
            System.out.println("6 .Exit From Account");
            int choice=sc.nextInt();
            if(choice==6){
                System.out.println("You have successfully exit from your account");
                break;
            }
            switch(choice){

                case 1 :
                    System.out.println("Enter money for deposit:");
                    double balance=sc.nextDouble();
                    boolean flag=sbiBankAccount.addMoney(money);
                    if(flag==true){
                        System.out.println("Rs ." +balance +" is deposited successfully!!");
                    }
                    break;
                case 2 :
                    System.out.print("Enter amount to withdraw:");
                    double withdraw=sc.nextDouble();
                    if(sbiBankAccount.withDrawMoney(withdraw)==true){
                        System.out.println("Rs ."+ withdraw+" withdraw successfully!!");
                    }
                    else{
                        System.out.println("Your account have less balance");
                    }
                    break;
                case 3 :
                    double bal= sbiBankAccount.checkBalance();
                    System.out.println("Your available Balance is "+bal);
                    break;

                case 4 :
                    double roi= sbiBankAccount.getROI();
                    System.out.println("Rate of Interest is " +roi );
                    break;
                case 5 :
                    System.out.println("Enter amount for loan:");
                    double loan=sc.nextDouble();
                    int time=sc.nextInt();
                    double interest= sbiBankAccount.totalInterest(loan,time);
                    System.out.println("Total Interest of Rs. "+loan +" is" +"Rs."+interest);
                    break;
                default:
                    System.out.println("Your choice is not matched");
            }
        }













    }
}