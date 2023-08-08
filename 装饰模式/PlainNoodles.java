package 装饰模式;

public class PlainNoodles implements Snack{
    private String name = "面";
    private double price = 10.0;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}