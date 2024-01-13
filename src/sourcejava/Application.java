package sourcejava;

public class Application {
    static NhuQuynhServices nhuQuynhServices = new NhuQuynhServices();
    public static void main(String args[]){
        System.out.println("Hello Class");
        nhuQuynhServices.alertLoginMessageV1();
    }
}
