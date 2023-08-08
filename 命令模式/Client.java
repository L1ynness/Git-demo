package 命令模式;

public class Client {
    public static void main(String[] args) {
        Command FishCommand,ChickenCommand,MeatCommand;
	FishCommand = new FishCommand();
        ChickenCommand = new ChickenCommand();
        MeatCommand = new MeatCommand();
	//创建控制器对象
        Controller controller = new Controller(FishCommand,MeatCommand,ChickenCommand);
        controller.execute();
    }
}
