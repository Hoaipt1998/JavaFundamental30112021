package OOP;

public class Parent extends Person{

    private  String address;


    //Primary constructor
    public Parent(String name, int age) {
        super(name, age);
    }

    //secondary constructor
    public Parent(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // tính đa hình: kế thừa và có từ khó override xuất hiện

    @Override
    String upperCaseName() {
        return "Parent " +
                "" + super.upperCaseName();
    }
}
