package userreporting;

import java.util.List;

public interface UserCollection {
    Iterator<User> createIterator();
    List<User> getUsers();
}

