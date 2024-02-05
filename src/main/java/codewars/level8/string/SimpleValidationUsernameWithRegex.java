package codewars.level8.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleValidationUsernameWithRegex {
    public static void main(String[] args) {
        System.out.println(validateUsr("regex")); // true
        System.out.println(validateUsr("Hass")); // false
        System.out.println(validateUsr("____")); // true
        System.out.println(validateUsr("asd43 34")); // false
    }

    public static boolean validateUsr(String s) {
        String USERNAME_PATTERN = "^[a-z0-9_]{4,16}$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

        /**Этот код определяет класс UsernameValidator, который содержит статический метод validateUsername.
        Этот метод принимает имя пользователя в качестве аргумента и возвращает true, если имя пользователя
        соответствует заданным условиям, и false в противном случае.

        В регулярном выражении "^[a-z0-9_]{4,16}$", мы используем следующие элементы:

        ^ - начало строки.
        [a-z0-9_] - символьный класс, который соответствует одному символу из множества: строчная буква,
        цифра или подчеркивание.
        {4,16} - квантификатор, который указывает, что предыдущий символ или символьный класс должен
        повторяться от 4 до 16 раз (включительно).
        $ - конец строки.
        Таким образом, данное регулярное выражение проверяет, что имя пользователя состоит только из
        разрешенных символов и имеет длину от 4 до 16 символов (включительно).
        **/

    public static boolean validateUsr1(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
}
