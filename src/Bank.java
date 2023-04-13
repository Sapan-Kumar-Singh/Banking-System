public interface Bank {
     double checkBalance();
    boolean addMoney(double money);
    boolean withDrawMoney(double money);
     double getROI();

    double totalInterest(double loanAmount , int timeInYears);
}
