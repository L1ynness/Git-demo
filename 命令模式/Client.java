package 命令模式;

public class Client {
    public static void main(String[] args) {
        Command FishCommand,ChickenCommand,MeatCommand;
        FishCommand = new FishCommand();
        ChickenCommand = new ChickenCommand();
        MeatCommand = new MeatCommand();
        Controller controller = new Controller(FishCommand,MeatCommand,ChickenCommand);
        controller.execute();
    }
}