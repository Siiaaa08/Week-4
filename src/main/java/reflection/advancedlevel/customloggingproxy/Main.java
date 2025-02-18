package reflection.advancedlevel.customloggingproxy;

import java.lang.reflect.Proxy;

public class Main {

        public static void main(String[] args) {
            ActualGreetings greet=new ActualGreetings();
            Greetings instance=(Greetings) Proxy.newProxyInstance(
                    ActualGreetings.class.getClassLoader(),
                    new Class[] {Greetings.class},
                    new GreetingHandler(greet)
            );
            instance.sayHello();

        }
    }


