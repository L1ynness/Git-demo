package 适配器.对象适配器;

public class Client {
    public static void main(String[] args) {
        C c = new UAdapter(new U());
        System.out.println(c.zipCode(12345));
        System.out.println(c.zipCode(123456));
    }
}