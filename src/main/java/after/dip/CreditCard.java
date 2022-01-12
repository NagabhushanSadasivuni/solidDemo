package after.dip;

public class CreditCard implements BankCard {

    public void doPay(long amt){

        System.out.println("paid using creditcard");

    }
}
