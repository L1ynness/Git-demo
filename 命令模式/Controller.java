package 命令模式;


import java.util.Scanner;

public class Controller {
    private Command grillFish,grillMeat,grillChicken;
    Scanner scanner = new Scanner(System.in);
    public Controller(Command grillFish, Command grillMeat,Command grillChicken){
        this.grillChicken = grillChicken;
        this.grillFish = grillFish;
        this.grillMeat = grillMeat;
    }
    public void execute(){
        System.out.println("请输入你想要吃什么");
        String choose = scanner.next();
        switch (choose){
            case "烤鱼":
                grillFish.execute();
                break;
            case "烤鸡翅":
                grillChicken.execute();
                break;
            case "烤肉":
                grillMeat.execute();
                break;
        }
    }
}