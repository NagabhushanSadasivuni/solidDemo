package after.dip;



public class Purchase {

   public BankCard bankcard;




    public Purchase(BankCard bankcard) {
        this.bankcard = bankcard;
    }

    public  void toPurchase(long amt){
        bankcard.doPay(3000);
    }




}
