package passwold;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassWold {
private static final String PASSWOLD_REGEX = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]))+.{6,32}";


    public boolean checkPass(String a){
    Pattern pattern1 = Pattern.compile(PASSWOLD_REGEX);
    Matcher matcher1 = pattern1.matcher(a);
    return matcher1.matches();
}

}
