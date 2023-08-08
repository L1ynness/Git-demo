package 命令模式;



public class FishCommand implements Command {
    grillFish grillFish ;
    public FishCommand(){
        grillFish = new grillFish();
    }
    @Override
    public void execute() {
        grillFish.grill();
    }
}
