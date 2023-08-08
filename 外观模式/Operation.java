package 外观模式;

public class Operation {
    private Button button;
    private Computer computer;
    private curtain curtain;
    private microphone microphone;
    private projector projector;
    public Operation() {
        button = new Button();
        computer = new Computer();
        microphone = new microphone();
        projector = new projector();
    }
    public void start(){
        button.startclass();
        computer.start();
        microphone.open();
        projector.open();
    }
    public void end(){
        button.endclass();
        computer.stop();
        microphone.stop();
        projector.close();
    }
}
