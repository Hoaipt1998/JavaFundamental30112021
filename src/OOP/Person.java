package OOP;

public class Person {
    //Thuộc tính
    private  String name;
    private int age;


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

    //setter , getter
    public  void  setName(String name){
        if(name.equals(""))
        {
            System.out.println("Giá trị rỗng");
        }
        else {
            this.name = name;
        }
    }
    public String getName()
    {
        return  name;
    }
    public  void  setAge(int age){
        if(age <= 0)
        {
            System.out.println("Giá trị rỗng");
        }
        else {
            this.age = age;
        }
    }
    public int getAge()
    {
        return  age;
    }


}
