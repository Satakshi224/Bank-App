import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String Name;
    private String AccountNo;
    private String Password;
     private double balance;
    private  Double rateOfInterest;

    public SBIUser(String name,  String password, double balance) {
        Name = name;

        Password = password;
        this.balance = balance;
        this.rateOfInterest=6.5;
        this.AccountNo=String.valueOf(UUID.randomUUID());

    }
    public double getrateOfInterest(){
      return rateOfInterest;
 }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;

    }

    @Override
    public String AddMoney(int Amount) {
        balance=balance +Amount;
        return "Your new balance is:"+balance;

    }

    @Override
    public String WithdrawMoney(int Amount, String enteredPassword) {

        if(Objects.equals(enteredPassword,Password)){
            if(Amount>balance) return "Sorry bro! no money";
            else{
                balance=balance-Amount;
                return "lots of money";
            }
       }
        else  return "Wrong password";
    }

    @Override
    public double CalculateInterest(int years) {
     return (balance*years*rateOfInterest)/100;

    }
}
