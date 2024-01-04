public class Check {
    public static final String REGEX = "^[a-zA-Z0-9_]*$";

    public static void checkUser(User user) {

        if (!user.getLogin().matches(REGEX)) {

            throw new WrongLoginException("В логине есть недопустимые символы");
        }
        if (user.getLogin().length()>20){
            throw new WrongLoginException("Недопустимая длина логина");
        }
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        if (!user.getPassword().matches(REGEX)) {
            throw new WrongPasswordException("В пароле есть недопустимые символы");
        }
        if (user.getPassword().length()>20){
            throw new WrongPasswordException("Недопустимая длина пароля");
        }
    }
}


