package Q5;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Q5Main {
    public static void main(String[] args) {
        Predicate<LocalDate> date = pDate -> pDate.isBefore(LocalDate.now());

        System.out.println(date.test(LocalDate.of(2021, 01, 21)));
    }
}
