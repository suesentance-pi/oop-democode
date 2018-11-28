package lecture11;

import java.util.function.Consumer;

public class CountClasses {
    class A {
        Consumer<String> function1 = x -> System.out.println(x);
        Consumer<String> function2 = System.out::println;
        Consumer<String> function3 =
                new Consumer<>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                };
        Consumer<String> function4 = function1.andThen(function2).andThen(function3);
    }
}
