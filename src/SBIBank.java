import java.util.UUID;

public class SBIBank implements Bank {
    private double balance;
    private String name;
    private double roi;
    private String password;
    private String accountNumber;

    public SBIBank(){
        this.balance=0.0;
        this.name="Default User";
        this.password="Default Password";
        this.accountNumber="null";
        this.roi=0.00;
    }

    public SBIBank(String name , String password ,double balance){
        this.name=name;
        this.password=password;
        this.balance=balance;
        this.accountNumber=String.valueOf(UUID.randomUUID());
    }

    public  boolean addMoney(double money){
        this.balance=this.balance+money;
        return true;
    }

    public boolean withDrawMoney( double money){
        if(money >this.balance){
            return false;
        }
        this.balance=this.balance-money;
        return true;
    }
    public double checkBalance(){
        return this.balance;
    }
    @Override
    public double getROI() {
        return this.roi;
    }

    @Override

    public double totalInterest(double loanAmount , int timeInYears){
        return ( loanAmount * roi * timeInYears)/100;
    }


}
