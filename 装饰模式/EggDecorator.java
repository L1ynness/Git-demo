package 装饰模式;

public class EggDecorator implements Snack{
    private Snack snack;
    private double price = 2.0;
    public EggDecorator(Snack snack) {
        this.snack = snack;
    }
    @Override
    public String getName() {
        return snack.getName()+"加鸡蛋";
    }
    @Override
    public double getPrice() {
        return snack.getPrice()+price;
    }
}
