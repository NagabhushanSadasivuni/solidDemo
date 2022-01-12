package after.srp;

public class SignUp implements Registration{


    @Override
    public void employee(String emp, String Id) {
        System.out.println("employee" + emp  +"employee Id" +  Id  +"signedUp successfully");
    }

    @Override
    public void customer() {

    }
}
