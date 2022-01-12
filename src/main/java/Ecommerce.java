import after.isp.GooglePay;
import after.isp.Paytm;
import after.dip.BankCard;
import after.dip.DebitCard;
import after.dip.Purchase;
import after.lsp.Facebook;
import after.lsp.SocialMedia;
import after.lsp.WhatsApp;
import after.ocp.MailService;
import after.ocp.MobileService;
import after.srp.SignUp;

public class Ecommerce {

    public static void main(String[] args) {


        //DI principle
        BankCard card = new DebitCard();
        Purchase shop = new Purchase(card);
        shop.toPurchase(3000);

        //IS principle

        GooglePay pay = new GooglePay();
        Paytm pay1 =new Paytm();
        pay.getCasBack();
        pay.getScatchCard();
        pay1.getShoppingCard();

        //LS priciple

        SocialMedia fb = new Facebook();
        fb.calling();
        WhatsApp wt = new WhatsApp();
        wt.chatting();

        //OC principle

        String gmail = null;
        String Android = null;
        MailService mail = new MailService();
        mail.productBook(gmail);
        MobileService mobile = new MobileService();
        mobile.productBook(Android);

        //SR Principle

        String emp = "naga";
        String  Id = "E1234";
        SignUp sign = new SignUp();
        sign.employee(emp , Id);




    }




}
