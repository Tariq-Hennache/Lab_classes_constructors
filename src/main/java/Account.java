public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String newId, String newName, int newBalance){
        this.id = newId;
        this.name = newName;
        this.balance = newBalance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
