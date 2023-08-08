package 命令模式;

public class ChickenCommand implements Command{
    grillChicken grillChicken ;
    public ChickenCommand(){
        grillChicken = new grillChicken();
    }
    @Override
    public void execute() {
        grillChicken.grill();
    }
}
