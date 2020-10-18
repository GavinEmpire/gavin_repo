package whut.com.hellospring.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (x,y)-> Integer.compare(x,y);

        //lambdaNoParamAndReturnValue();

        Consumer<String> con = x-> System.out.println(x);
        con.accept("everything will be fine!");

        Collections.sort();
    }

    private static void lambdaNoParamAndReturnValue() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };

        runnable.run();

        System.out.println("-------------------------------------------");

        Runnable run = () -> System.out.println("lambda expression");

        run.run();
    }
}
