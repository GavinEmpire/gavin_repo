package whut.com.hellospring.disign.pattern.stategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
