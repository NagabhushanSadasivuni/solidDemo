package before.lsp;

public class WhatsApp extends SocialMedia{
    @Override
    public void chatting() {

    }

    @Override
    public void calling() {

    }

    @Override
    public void publishPost() {
        System.out.println("Sorry--I couldn't serve your purpose");
    //this method is not supported by Whatsapp---so violates LSP
    }
}
