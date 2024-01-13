package sourcejava;

public class Application {
    static MinhNamServices minhNamServices = new MinhNamServices();

    public static void main(String args[]) {
        minhNamServices.alertLoginMessages();
        System.out.println("Hello Class");
    }
}
