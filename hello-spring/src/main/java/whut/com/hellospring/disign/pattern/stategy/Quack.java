package whut.com.hellospring.disign.pattern.stategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
