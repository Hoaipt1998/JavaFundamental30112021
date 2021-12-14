package OOP;

public class Main {
    public static void main(String[] args) {

        //1 object

        //tổ hợp phím xem tham số truyền vào function Ctrl+ p

        // tổ hợp phóm generate setter getter alt + insert

        // // tổ hợp phóm generate gợi ý sửa lỗi  alt + enter

//        Person teo = new Person("Nguyễn Văn Tèo" , 5);
//        teo.setName("");
//        //Thuộc tính
//
//        //heap memory
////        teo.age = 18;
////        teo.name  = "Nguyễn văn tèo";
//
//
//        Person ti = new Person("Nguyễn Văn tí", 5);
////        ti.name = "Nguyễn văn tí";
////        ti.age = 5;
//
//
//
//        System.out.println("Tuổi: "+teo.getAge());
//
//        System.out.println("Tên: "+ teo.upperCaseName());
//
//        System.out.println("Tuổi: "+ti.getAge());
//
//        System.out.println("Tên: "+ ti.getName());
        Parent dad = new Parent("Mr .a ", 5, "HCM");
        System.out.println(dad.upperCaseName());
        System.out.println(dad.getName());
        System.out.println(dad.getAddress());
        System.out.println(dad.getAge());

        //Tính chất của hướng đối tượng
        //- Đóng gói
        //- Kế thừa
        //- Đa Hình
        //- Trừu tượng
        //- Quan hệ Hash A


        //Access modifier: Phạm vi truy cập
        // - Public
        // - Private
        // - Protected



    }
}
