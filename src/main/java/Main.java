import Client.Client;
import Client.ClientFactory;
import Codes.Codes;
import Mail.DefaultMailInfo;
import Mail.MailBox;

public class Main {
    public static void main(String[] args) {
        ClientFactory f1 = new ClientFactory();
        MailBox mb1 = new MailBox();
        DefaultMailInfo m1 = new DefaultMailInfo(Codes.BIRTHDAY);
        Client cl1 = f1.getDefaultClient("a", 15, "M");
        m1.setClient(cl1);
        mb1.send_all();
    }
}
