package _18_string_and_regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAccount {
    private static final String ACCOUNT = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex) {
        Pattern p = Pattern.compile(ACCOUNT);
        Matcher matcher = p.matcher(regex);
        return matcher.matches();
    }

    public static String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        CheckAccount account = new CheckAccount();
        for (String acc : validAccount) {
            boolean isvalid = account.validate(acc);
            System.out.println("Account is " + acc + " is valid: " + isvalid);
        }
        for (String acc2 : invalidAccount) {
            boolean isvaLid2 = account.validate(acc2);
            System.out.println("Account is " + acc2 + " is valid: " + isvaLid2);
        }
    }
}
