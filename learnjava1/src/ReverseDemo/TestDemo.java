package ReverseDemo;

public class TestDemo {
    public boolean isPalindromicString(String s) {
        StringBuilder work = new StringBuilder(s);
        if (work.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }

    public String longestPalindrome(String s) {
        String temp = "";
        String ret = "";
        int max = 0;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i+1; j <= s.length(); ++j) {
                if (isPalindromicString(s.substring(i, j)) && temp.length() > max) {
                    ret = s.substring(i, j);
                    max = temp.length();
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "";
        TestDemo test = new TestDemo();
        System.out.println(test.longestPalindrome(s));
    }
}
