public class Main {
    public static void main(String[] args) {
        User user1 = new User(
                "java_skypro_go",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9");
        User user2 = new User(
                "Anna_123456",
                "A_123_321_55",
                "A_123_321-55");
        User user3 = new User(
                "forgetmyloginandpassword",
                "asd123",
                "asd123");


        Check.checkUser(user1);
        Check.checkUser(user2);
        Check.checkUser(user3);

    }

}