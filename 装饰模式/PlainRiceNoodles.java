package 装饰模式;

public class PlainRiceNoodles implements Snack{
    private String name = "粉";
    private double price = 9.0;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}