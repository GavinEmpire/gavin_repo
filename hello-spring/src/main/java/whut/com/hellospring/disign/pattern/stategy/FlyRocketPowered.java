package whut.com.hellospring.disign.pattern.stategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("一个火箭窜上天");
    }
}
