import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname test3
 * @Date 2022/4/14 14:21
 * @Created by 李晓阳
 */
public class test3 {
    public boolean isMatch(String s, String p) {
        Pattern work=Pattern.compile(p);
        Matcher matcher =work.matcher(s);
        if(matcher.matches())
            return true;
        return false;
    }
}
