package FinalTest;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Classname Work2
 * @Date 2022/4/28 11:01
 * @Created by 李晓阳
 */
public class Work2 {
    static HashMap<Integer, int[]> work = new HashMap<>();


    public static void getAllTwo(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                if (i != j) {
                    cnt++;
                    int[] a = new int[]{i, j};
                    ret.put(cnt, a);
                }
            }
        }
    }

    public static void getAllThree(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    if (i != j && i != k && j != k) {
                        cnt++;
                        int[] a = new int[]{i, j, k};
                        ret.put(cnt, a);
                    }

                }
            }
        }
    }

    //得到所有的互异的四个元素的数组
    public static void getAllFour(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            cnt++;
                            int[] a = new int[]{i, j, k, l};
                            ret.put(cnt, a);
                        }
                    }
                }
            }
        }
    }

    public static void getAllFive(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        for (int m = l + 1; m < 10; ++m) {//10000
                            if (i != j && i != k && i != l && j != k && j != l &&
                                    k != l && m != i && m != j && m != k && m != l) {
                                cnt++;
                                int[] a = new int[]{i, j, k, l, m};
                                ret.put(cnt, a);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getAllSix(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        for (int m = l + 1; m < 10; ++m) {//10000
                            for (int n = m + 1; n < 10; ++n) {
                                if (i != j && i != k && i != l && j != k && j != l &&
                                        k != l && m != i && m != j && m != k && m != l
                                        && n != i && n != j && n != k && n != l && n != m) {
                                    cnt++;
                                    int[] a = new int[]{i, j, k, l, m, n};
                                    ret.put(cnt, a);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getAllSeven(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        for (int m = l + 1; m < 10; ++m) {//10000
                            for (int n = m + 1; n < 10; ++n) {
                                for (int o = n + 1; o < 10; ++o) {
                                    if (i != j && i != k && i != l && j != k && j != l &&
                                            k != l && m != i && m != j && m != k && m != l
                                            && n != i && n != j && n != k && n != l && n != m
                                            && o != i && o != j && o != k && o != l && o != m && o != n) {
                                        cnt++;
                                        int[] a = new int[]{i, j, k, l, m, n, o};
                                        ret.put(cnt, a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getAllEight(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        for (int m = l + 1; m < 10; ++m) {//10000
                            for (int n = m + 1; n < 10; ++n) {
                                for (int o = n + 1; o < 10; ++o) {
                                    for (int q = o + 1; q < 10; ++q) {
                                        if (i != j && i != k && i != l && j != k && j != l &&
                                                k != l && m != i && m != j && m != k && m != l
                                                && n != i && n != j && n != k && n != l && n != m
                                                && o != i && o != j && o != k && o != l && o != m && o != n
                                                && q != i && q != j && q != k && q != l && q != m && q != n && q != o) {
                                            cnt++;
                                            int[] a = new int[]{i, j, k, l, m, n, o, q};
                                            ret.put(cnt, a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getAllNine(HashMap<Integer, int[]> ret) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {//1
            for (int j = i + 1; j < 10; ++j) {//10
                for (int k = j + 1; k < 10; ++k) {//100
                    for (int l = k + 1; l < 10; ++l) {//1000
                        for (int m = l + 1; m < 10; ++m) {//10000
                            for (int n = m + 1; n < 10; ++n) {
                                for (int o = n + 1; o < 10; ++o) {
                                    for (int q = o + 1; q < 10; ++q) {
                                        for (int r = q + 1; r < 10; ++r) {
                                            if (i != j && i != k && i != l && j != k && j != l &&
                                                    k != l && m != i && m != j && m != k && m != l
                                                    && n != i && n != j && n != k && n != l && n != m
                                                    && o != i && o != j && o != k && o != l && o != m && o != n
                                                    && q != i && q != j && q != k && q != l && q != m && q != n && q != o
                                                    && r != i && r != j && r != k && r != l && r != m && r != n && r != o && r != q) {
                                                cnt++;
                                                int[] a = new int[]{i, j, k, l, m, n, o, q, r};
                                                ret.put(cnt, a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getAllTen(HashMap<Integer, int[]> ret) {
        int[] workTemp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ret.put(1, workTemp);
    }


    //判断数字的位数是不是符合要求
    public static boolean judgeDigits(int temp, int toJudge) {
        if (temp == 0 && toJudge == 1) return true;
        int cnt = 0;
        while (temp != 0) {
            cnt++;
            temp = temp / 10;
        }
        return (cnt == toJudge);
    }

    //判断数字的各个组成是不是在range数组里面
    public static boolean judgeRange(int temp, int[] range) {
        while (temp != 0) {
            int work = temp % 10;
            int flag = 0;
            for (int a : range) {
                if (a == work) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    //根据所有数字初始化basket桶
    public static void judgeCompletePartOne(int num, boolean[] basket) {
        while (num != 0) {
            basket[num % 10] = true;
            num /= 10;
        }
    }

    //根据basket桶判断是不是覆盖了所有元素
    public static boolean judgeCompletePartTwo(boolean[] basket, int[] work) {
        for (int a : work) {
            if (!basket[a])
                return false;
        }
        return true;
    }


    public static void printRet(int one, int two, int three, int four, int five) {
        System.out.println("\t\t  " + one);
        System.out.println("*\t\t   " + two);
        System.out.println("——————————————");
        System.out.println("\t\t" + " " + three);
        System.out.println("\t\t" + four + " ");
        System.out.println("——————————————");
        System.out.println("\t\t" + five);
    }

    public static void main(String[] args) {
//        getAllTwo(work);          ------0
//        getAllThree(work);        ------3
//        getAllFour(work);         ------23
//        getAllFive(work);         ------336
//        getAllSix(work);          ------1645
//        getAllSeven(work);        ------4369
//        getAllEight(work);        ------5889
//        getAllNine(work);         ------2718
        getAllTen(work);
        boolean[] basket = new boolean[10];
        int cnt = 0;
        for (int i = 1; i <= work.size(); ++i) {
            int[] range = work.get(i);
//        int[] range = new int[]{9, 8, 7, 6};
            int one = 0;    //第一层：3
            int two = 0;    //第二层：2
            int three = 0;  //第三层：4
            int four = 0;   //第四层：4
            int five = 0;   //第五层：5
        /*
        条件是：
         one*(two%10)==three;
         one*(two/10)==four;
         one*two==five;
         three+four*10==five;
        */
            int p = 0;
            for (int a = 0; p < range.length && range[p] != 0; ++p) {
                a = range[p];
                for (int b : range) {
                    for (int c : range) {
                        one = 100 * a + 10 * b + c;
                        for (int d : range) {
                            for (int e : range) {
                                two = 10 * d + e;
                                {
                                    three = one * (two % 10);
                                    four = one * (two / 10);
                                    five = one * two;
                                    Arrays.fill(basket, false);
                                    judgeCompletePartOne(one, basket);
                                    judgeCompletePartOne(two, basket);
                                    judgeCompletePartOne(three, basket);
                                    judgeCompletePartOne(four, basket);
                                    judgeCompletePartOne(five, basket);

                                    if (((three + (four * 10)) == five) && judgeDigits(one, 3) && judgeDigits(two, 2)
                                            && judgeDigits(five, 5) && judgeDigits(four, 4) && judgeDigits(three, 4) &&
                                            judgeRange(three, range) && judgeRange(four / 10, range) && judgeRange(five, range)
                                    ) {

                                        if (judgeCompletePartTwo(basket, range)) {
                                            cnt++;
                                            System.out.println("-------------------------");
                                            System.out.print(cnt + ":\t");

                                            System.out.println("找到了！");
                                            System.out.println(Arrays.toString(range));
                                            printRet(one, two, three, four, five);
                                        }
                                    }
                                }
                            }
                        }


                    }
                }
//            System.out.println("没有找到");
            }
        }
        if (cnt == 0) {
            System.out.println("没有找到！");
            return;
        }
        System.out.println("-------------------------");
        System.out.println("cnt==" + cnt);
    }
}
