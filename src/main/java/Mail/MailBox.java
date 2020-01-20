package Mail;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<MailInfo>();
    private MailSender sender = new MailSender();
    public void add_mail_info(MailInfo mail){
        infos.add(mail);
    }
    public void send_all(){
        for (MailInfo mail:
             infos) {
            sender.send_mail(mail);
        }
    }
}
