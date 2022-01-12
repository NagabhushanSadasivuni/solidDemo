import before.isp.GooglePay;
import before.isp.Paytm;
import before.srp.DiffModules;
import before.dip.CreditCard;
import before.dip.DebitCard;
import before.dip.Purchase;
import before.lsp.Facebook;
import before.lsp.WhatsApp;
import before.ocp.NotificationSrevice;


public class EcommerceViolate {

    public static void main(String[] args) {

     //SR principle

     DiffModules fn = new DiffModules();
     fn.signUp("CompanyName");
     fn.signUp("normalcustomer");
     fn.product("Shoe");



     //OCP PRINCIPLE

        NotificationSrevice ns = new NotificationSrevice();
        ns.orderSuccess("email");
        ns.orderSuccess("mobile");

     //LS PRINCIPLE
        Facebook fb = new Facebook();
        fb.publishPost();
        WhatsApp wp = new WhatsApp();
        wp.publishPost();

     //IS PRINCIPLE
        Paytm pm = new Paytm();
        pm.getScatchCard(); //this is something that Paytm is not offering
        GooglePay gp = new GooglePay();
        gp.getCasBack();
        gp.getScatchCard();


     //DI PRINCIPLE


        CreditCard creditCard = new CreditCard();
        DebitCard debitCard =new DebitCard() ;
        Purchase shop = new Purchase(debitCard);
        shop.toPurchase(3000);


    }
}
