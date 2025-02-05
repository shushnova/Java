import java.util.Arrays;

public class UsersArrayList implements UsersList {
    User[] users;
    private int size;
    private int capacity;

    public UsersArrayList() {
        this.capacity = 0;
        this.users = new User[capacity];
        this.size = 0;
    }



    @Override
    public void add(User user) {
        if (size == capacity) {
            increaseCapacity();
        }
        users[size] = user;
        size++;
    }

    @Override
    public User getById(int id) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        throw new UserNotFoundException("User with ID " + id + " not found");
    }

    @Override
    public User getByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return users[index];
    }

    @Override
    public int size() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }


    private void increaseCapacity() {
        int newCapacity = capacity + (capacity / 2);
        User[] newUsers = new User[newCapacity];
        for (int i = 0; i < size; i++) {
            newUsers[i] = users[i];
        }
        users = newUsers;
        capacity = newCapacity;
    }
}
