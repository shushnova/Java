public class User {

        private final int id;
        private final String name;
        private int age;
//        private int id;

        public User(int id, String name, int age) {
            this.name = name;
            this.age = age;
            this.id = UserIdsGenerator.getInstance().generateId();
        }
        public int getId(){
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return "User{" + "id=" + id + ", name='" + name + '\'' + ",age=" + age + '}';
        }
    }

