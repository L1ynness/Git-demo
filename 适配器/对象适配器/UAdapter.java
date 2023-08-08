package 适配器.对象适配器;

public class UAdapter implements C {
    private U u;
    public UAdapter(U u) {
        this.u = u;
    }
    @Override
    public String zipCode(int code) {
        String codeStr = String.valueOf(code);
        if (codeStr.length() == 5) {
            return u.findZipCode(codeStr);
        } else if (codeStr.length() == 6) {
            if (code == 123456) {
                return "中国";
            }
        }
        return null;
    }
}
