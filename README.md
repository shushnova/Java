# Java

### Exercise 02 – List of Users
Now we need to implement some functionality for saving users while the program is running. 

Currently, your application does not have any persistent storage (such as a file system or database). However, we want to avoid making your logic dependent on the user storage implementation method. To provide more flexibility, we define a UsersList interface that describes the following behavior

- Add a user;
- Get a user by ID;
- Get a user by index;
- Get number of users.

This interface will allow you to develop the business logic of your application so that a specific storage implementation does not affect other system components.

We will also implement a UsersArrayList class that implements the UsersList interface.

This class will use an array to store user data. The default size of the array is 10. When the array is full, its size is increased by half. The user-add method puts an object of type User into the first empty cell of the array.

If an attempt is made to retrieve a user with a non-existent ID, a non-checked UserNotFoundException must be thrown.

An example of using such classes is included in the program file (creating, initializing, printing object contents to a console).

**Note**:<br>
Nested `ArrayList<T>` Java class has the same structure. By modeling behavior of this class on your own, you will learn how to use mechanisms of this standard library class. 
### Exercise 03 — List of Transactions

Unlike users, a list of transactions requires a special implementation approach. Since the number of transaction creation operations can be very large, we need a storage method to avoid a costly array size extension. 

In this task, we offer you to create TransactionsList interface describing the following behavior:
- Add a transaction;
- Remove a transaction by ID (in this case, UUID string identifier is used);
- Transform into array (ex. Transaction[] toArray()).

A list of transactions shall be implemented as a linked list (LinkedList) in TransactionsLinkedList class. Therefore, each transaction shall contain a field with a link to the next transaction object.
If an attempt is made to remove a transaction with non-existent ID, TransactionNotFoundException runtime exception must be thrown.
An example of use of such classes shall be contained in Program file (creation, initialization, printing object content on a console).

**Note**:<br>
- We need to add transactions field of TransactionsList type to User class so that each user can store the list of their transactions.
- A transaction must be added with a SINGLE operation (O(1)).
- `LinkedList<T>` nested Java class has the same structure, a bidirectional linked list.
