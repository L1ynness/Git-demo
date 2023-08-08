package 适配器.类适配器;

public class Client {
    public static void main(String[] args) {
        U u = new CAdapter();
        String usZipcode = "12345";
        String usAddress = u.findzipcode(usZipcode);
        System.out.println("美国的邮政编码 " + usZipcode + " 地址是： " + usAddress);
        String cnZipcode = "100085";
        String cnAddress = u.findzipcode(cnZipcode);
        System.out.println("中国的邮政编码 " + cnZipcode + " 地址是： " + cnAddress);
    }
}