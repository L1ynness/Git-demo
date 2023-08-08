package 模板方法模式;

import java.util.Scanner;

public class Banana extends LivePlay{
    @Override
    public void cutFruit() {
        System.out.println("切香蕉");
    }

    @Override
    public void putInMachine() {
        System.out.println("放入榨汁机");
    }

    @Override
    public void putInFlavoring() {
        System.out.println("请选择放入的调料");
        Scanner scanner = new Scanner(System.in);
        String flavoring = scanner.next();
        if(flavoring.equals("蜂蜜")){
            System.out.println("放入蜂蜜");
        } else if (flavoring.equals("苏打水")) {
            System.out.println("放入苏打水");
        }else System.out.println("纯苹果汁");
    }

    @Override
    public void Start() {
        System.out.println("启动机器");
    }
}