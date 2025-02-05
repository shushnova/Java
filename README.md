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
