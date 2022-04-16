package Leetcode;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReverseInteger {
public static int reverse(int x) {
        int symbol = -1;
        if (x >= 0)
            symbol = 1;
        String str = String.valueOf(x * symbol);
        StringBuilder stringBuffer = new StringBuilder(str);
        stringBuffer.reverse();
        str = stringBuffer.toString();
        try {
            return Integer.parseInt(str) * symbol;
        } catch (NoSuchElementException ex) {
            return 0;
        }
    }


    //1534236469
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            System.out.println(reverse(a));
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}

