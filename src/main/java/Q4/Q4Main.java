package Q4;

import Q4.model.User;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Q4Main {
    public static void main(String[] args) {
        Predicate<User> userPredicate = user -> user.getAge() >= 18;

        System.out.println(userPredicate.test(new User("Jonh", "Snow", LocalDate.of(2001, 03, 27))));

    }
}
