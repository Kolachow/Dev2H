package Q3;

import Q3.model.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Consumer;

public class Q3Main {
    public static void main(String[] args) {
        Consumer<User> userConsumer = user -> {
            System.out.println("First name: " + user.getFirstName()
            + "\nLast name: " + user.getLastName()
            + "\nBirth date: " + user.getBirthDate()
            + "\nAge: " + user.getAge());
        };

        userConsumer.accept(new User("Naruto", "Dragonball",
                LocalDate.of(1989, 03, 27)));
    }
}
