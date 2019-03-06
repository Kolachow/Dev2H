package Q2;

import java.util.function.Consumer;

public class Q2Main {
    public static void main(String[] args) {
        Consumer<String> consumer = time -> {
            String[] hour = time.split(":");
            System.out.println("Godzina: " + hour[0]
            + "\nMinuty: " + hour[1]);
        };

        consumer.accept("3:34");
    }

}
