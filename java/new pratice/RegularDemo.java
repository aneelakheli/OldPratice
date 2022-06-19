import java.util.regex.*;

public class RegularDemo {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String check = "happy birthday my boy , i love you to the moon and back";
        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(check);
        while (c.find()) {
            System.out.println(check.substring(c.start(), c.end()));
        }
    }
}
