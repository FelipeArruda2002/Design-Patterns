package userreporting;

public class UserIterator implements Iterator<User> {

    private int index = 0;
    private UserCollection userCollection;

    public UserIterator(UserGroup userGroup) {
        this.userCollection = userGroup;
    }

    @Override
    public User getNext() {
        if (hasMore()) {
            return userCollection.getUsers().get(index++);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return index < userCollection.getUsers().size();
    }
}
