import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsersArrayListTest {

    @Test
    public void testCapacityIncrease() {
        UsersArrayList usersList = new UsersArrayList();

        // Add users until reaching the initial capacity
        for (int i = 0; i < 10; i++) {
            usersList.add(new User(i, "User " + i, 40));
        }

        // Check initial capacity
        assertEquals(10, usersList.getCapacity());

        // Add one more user to trigger capacity increase
        usersList.add(new User(30, "User 10", 18));

        // Check if capacity has increased
        assertEquals(20, usersList.getCapacity());
        System.out.println(usersList.getCapacity());
    }

@Test
void testGetByIdAndIndex() {
    UsersArrayList users = new UsersArrayList();

    users.add(new User(1, "Alice", 25));
    users.add(new User(2, "Bob", 30));
    users.add(new User(3, "Charlie", 35));

    assertEquals("Alice", users.getById(1).getName());
    assertEquals(25, users.getById(1).getAge());
    assertEquals("Bob", users.getByIndex(1).getName());
    assertEquals(30, users.getByIndex(1).getAge());

    try {
        users.getByIndex(-1);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        // Expected
    }

    try {
        users.getById(4);
        fail("Expected UserNotFoundException");
    } catch (UserNotFoundException e) {
        // Expected
    }
}

    @Test
    void testSize() {
        UsersArrayList users = new UsersArrayList();

        assertEquals(0, users.size());

        users.add(new User(1, "Alice", 25));
        users.add(new User(2, "Bob", 30));

        assertEquals(2, users.size());
    }
}