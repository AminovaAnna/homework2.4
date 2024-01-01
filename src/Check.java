public class Check {
    public static void checkUser(String login){
     if (login.length() > 20 || login.contains(".") || login.contains("-")) {
         throw new IllegalArgumentException("Недопустимые переменные");
     }
    }


}
