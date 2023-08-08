package 适配器.对象适配器;

public class U {
    public String findZipCode(String zipCode) {
        if (zipCode.equals("12345")) {
            return "美国";
        }
        return null;
    }
}
