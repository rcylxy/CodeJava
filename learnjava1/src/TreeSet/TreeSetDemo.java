package TreeSet;

import java.awt.print.PrinterGraphics;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<String>();

        ts.add("hello");
        ts.add("rcy");
        ts.add("i love you");
        ts.add("rcy");

        System.out.println();
        System.out.println(ts);
        System.out.println("--------");

        for(String i:ts)
        {
            System.out.println(i);
        }
    }
}
