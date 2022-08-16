public class Real_world_example {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Real_world_example(int newId, String newFirstName, String newLastName, double newHeldMoney){
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.heldMoney = newHeldMoney;
    }

    @Override
    public String toString() {
        return "Real_world_example{" + "id='" + id + ", firstname='" + firstName + ", lastname=" + lastName + "heldMoney=" + heldMoney +'}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeldMoney() {
        return this.heldMoney;
    }

    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public void subtractHeldMoney(double subtractedValue){
        heldMoney-= subtractedValue;
    }

    }
