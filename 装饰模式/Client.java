package 装饰模式;

public class Client {
    public static void main(String[] args) {
	//实现对象注入
        Snack snack = new PlainNoodles();
        snack = new BeefDecorator(snack);
        snack = new EggDecorator(snack);
        System.out.println(snack.getName());
        System.out.println(snack.getPrice() + "元");
    }
