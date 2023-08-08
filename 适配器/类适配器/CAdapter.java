package 适配器.类适配器;

public class CAdapter extends C implements U{
    @Override
    public String findzipcode(String zipcode) {

        if(zipcode.length() == 5) {
            int[] code = {3, 5, 2, 1, 4};
            return super.zipcode(code)+zipcode;
        } else if (zipcode.length() == 6) {
            int[] code = {5, 5, 2, 7, 4};
            return super.zipcode(code)+zipcode;
        }else {
            return null;
        }
    }
}
