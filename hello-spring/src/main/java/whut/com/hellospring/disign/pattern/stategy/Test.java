package whut.com.hellospring.disign.pattern.stategy;

public class Test {
    public static void main(String[] args) {
//        MallardDuck duck = new MallardDuck();
//        duck.performanceFly();
//        duck.performanceQuack();

        ModelDuck modelDuck =new ModelDuck();
        modelDuck.performanceFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performanceFly();
    }
}
