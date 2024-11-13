package userreporting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserGroup implements UserCollection {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void deactivateUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.deactivate();
                break;
            }
        }
    }

    public int getActiveUserCount() {
        return (int) users.stream().filter(User::isActive).count();
    }

    public List<User> getActiveUsers() {
        return users.stream().filter(User::isActive).collect(Collectors.toList());
    }

    public List<User> getActiveUsersStartingWith(String prefix) {
        return getActiveUsers().stream()
                .filter(user -> user.getName().startsWith(prefix))
                .collect(Collectors.toList());
    }

    public List<User> getActiveUsersCreatedBefore(LocalDate date) {
        return getActiveUsers().stream()
                .filter(user -> user.getCreationDate().isBefore(date))
                .collect(Collectors.toList());
    }

    // Método para fornecer acesso à lista de usuários para o iterador
    @Override
	public List<User> getUsers() {
        return users;
    }

    @Override
    public Iterator<User> createIterator() {
        return new UserIterator(this);
    }
}
