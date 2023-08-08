package 装饰模式;

public class BeefDecorator implements Snack{
    private Snack snack;
    private double price = 5.0;
    public BeefDecorator(Snack snack) {
        this.snack = snack;
    }
    @Override
    public String getName() {
        return snack.getName()+"加牛肉";
    }
    @Override
    public double getPrice() {
        return snack.getPrice()+price;
    }
}
