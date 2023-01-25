public interface BankInterface {
   double checkBalance() ;
   String AddMoney(int Amount);
   String WithdrawMoney(int Amount,String password);
    double CalculateInterest(int years);



}
