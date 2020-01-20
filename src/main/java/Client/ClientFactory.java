package Client;

public class ClientFactory {
    private int lastId = 0;
    public Client getDefaultClient(String name, int age, String sex) {
        lastId++;
        return new DefaultClient(lastId - 1, name, sex, age);
    }
}
