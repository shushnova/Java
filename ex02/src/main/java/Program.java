public class Program {
    public static void main( String[] args) {
        UsersList users = new UsersArrayList();
        users.add(new User(1, "Ira", 25));
        users.add(new User(2, "Kat", 30));

        System.out.println("Number of users: " + users.size());

        try{
            System.out.println("User at index 0:" + users.getByIndex(0));
            System.out.println("User with ID 2:" + users.getById(2));
            System.out.println("User with ID 100: " + users.getById(100));
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }




        }
    }

