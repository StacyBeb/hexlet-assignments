package exercise;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> list) {
        long countFreeEmails = list.stream()
                .filter(x -> !x.isEmpty())
                .filter(x -> x.contains("@gmail.com") || x.contains("@yandex.ru") || x.contains("@hotmail.com"))
                .count();
        return countFreeEmails;
    }
}
// END
