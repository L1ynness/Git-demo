package 适配器.类适配器;

public class C {
    public String zipcode(int[] code) {
        String c = "";
        for (int i = 0 ;i<code.length;i++){
            c= c+code[i];
        }
        return c;
    }
}