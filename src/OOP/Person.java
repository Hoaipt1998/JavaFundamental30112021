package OOP;

public class Person {
    //Thuộc tính
    String name;
    int age;


    //constructor: Phương thức khởi tạo

    public  Person( String name, int age){
        this.name = name; // this dùng để phân biệt thuộc tính của class với biến truyền vào
        this.age = age;
    }

    //Phương thức
    String upperCaseName()
    {
         String newName = name.toUpperCase();
         return  newName;
    }

}
