package 命令模式;

public class MeatCommand implements Command{
    grillMeat grillMeat;
    public MeatCommand(){
        grillMeat = new grillMeat();
    }
    @Override
    public void execute() {
        grillMeat.grill();
    }
}
