import java.util.List;

public interface UsersList {
    void add(User user);



    User getById(int id) throws UserNotFoundException;
User getByIndex(int index) throws IndexOutOfBoundsException;
int size();
}