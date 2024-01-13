package sourcejava;

public class Application {
    static NhuQuynhServices nhuQuynhServices = new NhuQuynhServices();
    static MinhNamServices minhNamServices = new MinhNamServices();
    public static void main(String args[]){
        System.out.println("Hello Class");
        nhuQuynhServices.alertLoginMessageV1();
        minhNamServices.alertLoginMessages();
    }
}
