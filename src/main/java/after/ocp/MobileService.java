package after.ocp;

public class MobileService implements NotificationService {


    @Override
    public void productBook(String Medium) {
        System.out.println("send message of product booking");
    }

    @Override
    public void productCancel(String Medium) {
        System.out.println("send message of product cancel");
    }
}
