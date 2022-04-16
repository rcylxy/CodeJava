import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname test2
 * @Date 2022/4/13 21:18
 * @Created by 李晓阳
 * how to make the regExp
 */
public class test2 {
    public static void main(String[] args) {
        int cnt = 0;
        String content = "islixiaoyang2021@163.com";
        String regStr = "";
        Pattern work = Pattern.compile(regStr);
        Matcher matcher = work.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：\t" + (++cnt) + "\t\t" + matcher.group(0));
        }
    }

}
