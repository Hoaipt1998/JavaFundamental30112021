package OOP.demointerface;

public class Authentication implements Resource {

    public  Authentication(){
        loading();
        if(true){
            success();
        }
        else {
            fail();
        }
    }
    @Override
    public void loading() {
        System.out.println("Loading....");
    }

    @Override
    public void success() {
        System.out.println("Success....");

    }

    @Override
    public void fail() {
        System.out.println("Failed....");

    }
}
