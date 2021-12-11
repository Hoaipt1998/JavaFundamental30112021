package OOP;

public class Main {
    public static void main(String[] args) {

        //1 object

        //tổ hợp phím xem tham số truyền vào function Ctrl+ p

        Person teo = new Person("Nguyễn Văn Tèo" , 5);
        //Thuộc tính

        //heap memory
//        teo.age = 18;
//        teo.name  = "Nguyễn văn tèo";


        Person ti = new Person("Nguyễn Văn tí", 5);
//        ti.name = "Nguyễn văn tí";
//        ti.age = 5;



        System.out.println("Tuổi: "+teo.age);

        System.out.println("Tên: "+ teo.upperCaseName());

        System.out.println("Tuổi: "+ti.age);

        System.out.println("Tên: "+ ti.name);


    }
}
