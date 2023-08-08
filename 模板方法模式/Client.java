package 模板方法模式;



public class Client {
    public static void main(String[] args) {
        LivePlay cider = new Cider();
        cider.seeLivePlay();
        System.out.println();
        LivePlay banana = new Banana();
        banana.seeLivePlay();
    }
}