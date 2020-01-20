package Client;

import Mail.MailInfo;

import java.util.ArrayList;

public class DefaultClient implements Client {
    private int id;
    private String name;
    private String sex;
    private int age;
    private ArrayList<MailInfo> received = new ArrayList<MailInfo>();

    public DefaultClient(int id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void getMail(MailInfo mail) {
        received.add(mail);
    }

    public ArrayList<MailInfo> getReceived() {
        return received;
    }

    public DefaultClient setAge(int age) {
        this.age = age;
        return this;
    }

    public DefaultClient setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public DefaultClient setName(String name) {
        this.name = name;
        return this;
    }

    public DefaultClient setId(int id) {
        this.id = id;
        return this;
    }
}
