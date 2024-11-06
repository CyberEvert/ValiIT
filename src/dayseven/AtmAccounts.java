package dayseven;

import java.util.ArrayList;
import java.util.List;

public class AtmAccounts {
    private static final List<User> users = new ArrayList<>(List.of(
            new User("Alice", 1234, 1000.00),
            new User("Madis", 5678, 1500.00),
            new User("Bob", 9012, 500.00)));

    public User validateUser(int pin) {
        for (User user : users) {
            if (user.getPin() == pin) {
                return user;
            }
        }
        return null;
    }
}