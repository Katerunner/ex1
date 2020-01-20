package Mail;

import Client.Client;
import Codes.Codes;

public class DefaultMailInfo implements MailInfo {
    private Client client;
    private Codes code;

    public DefaultMailInfo(Client client, Codes code) {
        this.client = client;
        this.code = code;
    }

    public DefaultMailInfo(Codes code) {
        this.code = code;
    }

    public Client getClient() {
        return client;
    }

    public DefaultMailInfo setClient(Client client) {
        this.client = client;
        return this;
    }

    public Codes getMailCode() {
        return code;
    }

    public void setMailCode(Codes code) {
        this.code = code;
    }

    @Override
    public void sendMail() {
        client.getMail(this);
    }
}
