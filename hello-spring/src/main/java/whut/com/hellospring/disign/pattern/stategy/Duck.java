package whut.com.hellospring.disign.pattern.stategy;

public abstract class Duck {

     FlyBehavior flyBehavior;

     QuackBehavior quackBehavior;

    public void performanceQuack(){
        //System.out.println("呱呱叫");
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println(" I can swim");
    }

    public void performanceFly(){
        //System.out.println(" I can fly");
        flyBehavior.fly();
    }


    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
