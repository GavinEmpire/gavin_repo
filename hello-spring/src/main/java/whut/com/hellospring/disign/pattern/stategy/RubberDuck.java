package whut.com.hellospring.disign.pattern.stategy;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }

    public void quack(){
        System.out.println("啊吱吱吱");
    }

    public void fly(){
        //do nothing
    }
}
