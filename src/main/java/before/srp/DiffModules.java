package before.srp;

public class DiffModules {


    public void login(){
        System.out.println("enter login and password");
    }

    public void signUp(String RegOffer){

       if(RegOffer.equals("CompanyName")){
           System.out.println("give offered sign up pack");
       }

       if(RegOffer.equals("normalcustomer")){
           System.out.println("give normal signUP");
       }
    }

    public void product(String productName) {
        if (productName.equals("Shoe")) {
            System.out.println("give 10% boffer");
        }
        if (productName.equals("clothes")) {
            System.out.println("give 20% boffer");
        }

    }

}
