package 模板方法模式;

public abstract class LivePlay {
    public final void seeLivePlay(){
         cutFruit();
         putInMachine();
         putInFlavoring();
         Start();
    }
    public abstract void cutFruit();
    public abstract void putInMachine();
    public abstract void putInFlavoring();
    public abstract void Start();
}