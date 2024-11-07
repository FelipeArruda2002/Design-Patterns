package userreporting;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserGroup userGroup = new UserGroup();

        userGroup.addUser(new User("Alice", true, LocalDate.of(2023, 1, 15)));
        userGroup.addUser(new User("Bob", false, LocalDate.of(2022, 11, 23)));
        userGroup.addUser(new User("Carol", true, LocalDate.of(2023, 5, 8)));

        System.out.println("Active Users:");
        for (User user : userGroup.getActiveUsers()) {
            System.out.println(user.getName());
        }

        System.out.println("Number of Active Users: " + userGroup.getActiveUserCount());

        System.out.println("Active Users starting with 'A':");
        for (User user : userGroup.getActiveUsersStartingWith("A")) {
            System.out.println(user.getName());
        }

        System.out.println("Active Users created before 2023-03-01:");
        for (User user : userGroup.getActiveUsersCreatedBefore(LocalDate.of(2023, 3, 1))) {
            System.out.println(user.getName());
        }

        System.out.println("Deactivating user Alice...");
        userGroup.deactivateUser("Alice");

        System.out.println("Active Users after deactivation:");
        for (User user : userGroup.getActiveUsers()) {
            System.out.println(user.getName());
        }
    }
}
