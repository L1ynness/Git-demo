package 装饰模式;

public class PorkDecorator implements Snack{
    private Snack snack;
    private double price = 3.0;
    public PorkDecorator(Snack snack) {
        this.snack = snack;
    }
    @Override
    public String getName() {
        return snack.getName()+"加猪肉";
    }
    @Override
    public double getPrice() {
        return snack.getPrice()+price;
    }
}
