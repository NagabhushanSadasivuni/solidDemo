package before.dip;

public class Purchase {

    private DebitCard debitCard;

    public Purchase(DebitCard debitCard) {
        this.debitCard = debitCard;

    }

    public void toPurchase(long amt){

        debitCard.doPay();
    }
 /*FOR USING CREDIT CARD
 private CreditCard creditCard;

    public Purchase(CreditCard creditCard) {
        this.creditCard = creditCard;

    }

    public void toPurchase(long amt){

        creditcard.doPay()
    }

  */




}
