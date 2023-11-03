package phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
private static Pattern pattern;
private Matcher matcher;
private static final String PHONE_REGEX = "(84|0)+(3[2-9]|9[6-8]|86)+([0-9]{7})";

    public Phone() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
