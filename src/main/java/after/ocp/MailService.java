package after.ocp;

public class MailService implements  NotificationService{
    @Override
    public void productBook(String Medium) {
     System.out.println("send message of product booking"+Medium);
    }

    @Override
    public void productCancel(String Medium) {
        System.out.println("send message of product cancel"+Medium);

    }
}
