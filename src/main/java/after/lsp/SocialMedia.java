package after.lsp;

public abstract class SocialMedia {




        //@supported by fb,instagram,Whatsapp
        public  void chatting(){
            System.out.println("I'm chatting");
        }


        // @supported by fb,Whatsapp
        public  void calling(){
            System.out.println("I'm calling");
        }

        public  abstract void like();
    }

