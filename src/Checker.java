import java.util.Objects;
import java.util.regex.Pattern;

public class Checker {

    public static void checkParametrs(String login, String password, String confirmPassword) {

        if (!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)) {
            throw new WrongLoginException("Неверный формат login!");
        }

        if (!Pattern.matches("^[a-zA-Z0-9_]{1,19}$", password)) {
            throw new WrongPassworException("Неверный формат password!");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPassworException("Пароль не совпадает!");
        }


    }


}

