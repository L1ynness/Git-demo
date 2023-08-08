package 外观模式;

public class Client {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println("-------上课-------");
        operation.start();
        System.out.println("-------下课-------");
        operation.end();
    }
}
