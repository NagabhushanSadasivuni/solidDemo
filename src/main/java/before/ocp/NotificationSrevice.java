package before.ocp;

public class NotificationSrevice {

    public void orderSuccess(String Medium){

        if(Medium.equals("email")){
            System.out.println("mail notification sent");
        }

        if(Medium.equals("mobile")){
            System.out.println("mobile notification sent");
        }


    }
}
