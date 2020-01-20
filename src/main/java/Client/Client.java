package Client;

import Mail.MailInfo;

public interface Client {
    int getId();
    String getName();
    int getAge();
    String getSex();
    void getMail(MailInfo mail);
}
