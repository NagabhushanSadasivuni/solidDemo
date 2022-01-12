package before.isp;

public class Paytm implements UpiPayments {

    @Override
    public void payMoney() {

    }

    @Override
    public void getScatchCard() {
    //Paytm don't want this feature tobe implemented thus violated isp
        System.out.println("Sorry I couldn't provide you a ScratchCard");
    }

    @Override
    public void getCasBack() {

    }

    @Override
    public void getShoppingCard() {

    }
}
