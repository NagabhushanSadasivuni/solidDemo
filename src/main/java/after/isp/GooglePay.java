package after.isp;

public class GooglePay implements UpiPayments,ScratchCard{
    @Override
    public void getScatchCard() {
        System.out.println("Im into Scratchcard");
    }

    @Override
    public void payMoney() {
        //write code here
        System.out.println("Im into PayMoney");
    }

    @Override
    public void getCasBack() {
        //write code here
        System.out.println("Im into getcashBack");
    }

    @Override
    public void getShoppingCard() {
        //write code here
        System.out.println("Im into getShoppingCard");
    }
}
