package whut.com.hellospring.disign.pattern.stategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with my wings");
    }
}
