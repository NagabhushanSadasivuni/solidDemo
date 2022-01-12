package after.lsp;

public class Facebook extends SocialMedia implements Post{

    @Override
    public void publishPost() {

        System.out.println("I have posted something");
    }

    @Override
    public void like() {

        System.out.println("I liked a post");
    }
}
