package FinalTest;

/**
 * @Classname Work1
 * @Date 2022/4/28 11:01
 * @Created by 李晓阳
 */
public class Work1 {
    public static void main(String[] args) {
        int N, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
        int MAXRETURN = 0;
        int MINRETURN = 65535;
        // N=a+b+c+d+e+f+g+h;
        // a+b+d+e==50;
        // a+d+g+h==61;
        // a+b+c+h==13;
        // b+d+e+f==74;
        //a,b,c,h的范围是13；d，e的范围是50；g,f的范围是61
        for (a = 1; a > 0 && a <= 10; ++a)
            for (b = 1; b > 0 && b <= 10; ++b)
                for (c = 1; c > 0 && c <= 10; ++c)
                    for (d = 1; d > 0 && d <= 47; ++d)
                        for (e = 50 - a - b - d; e > 0 && e <= 47 && d + e == 50 - a - b; ++e)
                            for (f = 74 - b - d - e; f > 0 && f <= 71 && e + f == 74 - b - d; ++f)
                                for (g = 1; g > 0 && g <= 58; ++g)
                                    for (h = 13 - a - b - c; h > 0 && h <= 10 && c + h == 13 - a - b; ++h) {
                                        if (a + b + d + e == 50 && a + d + g + h == 61 && a + b + c + h == 13 && b + d + e + f == 74) {
                                            int temp = a + b + c + d + e + f + g + h;
//                                            System.out.println("[" + a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "]");
//                                            System.out.println();
                                            if (temp > MAXRETURN) {
                                                MAXRETURN = temp;
                                            }
                                            else if (temp < MINRETURN) {
                                                MINRETURN = temp;
                                            }
                                        }
                                    }
        System.out.println(MAXRETURN+","+MINRETURN);


    }
}