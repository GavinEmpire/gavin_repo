package whut.com.hellospring.disign.pattern.stategy;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("我是绿头鸭");
    }

}
