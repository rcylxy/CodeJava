# 期末作业
## 民意调查
### 题干：
> 为了解人们获取新闻的来源，调查小组对N个人进行了民意调查，其结果如下：
> 50人使用电视作为新闻来源，其中包括只看电视的和结合其他新闻来源的人；
> 61人不适用收音机作为新闻来源；
> 13人不适用报纸作为新闻来源；
> 74人至少使用两种方式来获取新闻。
> 求N的最大值和最小值。
### 算法：
### 代码：
### 结果：
### 小结：
---
## 还原竖式
### 题干：
>下图的乘法竖式中，每一个星号代表一个数位。若出现的数字有且仅有2,3,5,7四种，
> 能将此竖式完全还原吗？<br>
> 进一步，若将题目中的2，3，5，7改为其它互异的四个数字，还存在要求的乘法竖式吗？<br>
> 进一步，若将题目中的2，3 ，5，7改为其它互异的多个(2~10)数字，还存在要求的乘法竖式吗？<br>
### 算法：
> 分为几个函数，下面分别进行介绍：<br>

> public static void getAllOne(HashMap<Integer, int[]> ret) --> getAllTen
>  这个函数的功能是得到所有n位互异整数,并以HashMap的形式进行返回。

> public static boolean judgeDigits(int temp, int toJudge) <br>
> 这个函数的功能是判断数字的位数是不是符合我们的要求。

> public static boolean judgeRange(int temp)<br>
> 这个函数的功能是判断所有组成数字是不是符合我们的要求（是不是在range数组之中）。

> public static void printRet(int one, int two, int three, int four, int five) <br>
> 这个函数的功能是针对本题进行整齐的输出。

> public static void judgeCompletePartOne(int num, boolean[] basket) <br>
> 根据所有数字初始化basket桶,目的是检查是不是完全覆盖了目标数组

> public static boolean judgeCompletePartTwo(boolean[] basket, int[] work) <br>
> 根据目标数组和上一函数得到的桶，返回是否完全覆盖了目标数组

> 主函数 <br>
> 思想就是遍历，并相应的，满足条件时输出即可。
### 代码：
```java
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

```
### 结果：
![Alt text](s2.png)
![Alt text](s2-2.png)
![Alt text](s2-3.png)
> 由计算可知，第二个小问答案是：有，并有23种可能。
> getAllTwo(work);          ------0   <br>
> getAllThree(work);        ------3   <br>
> getAllFour(work);         ------23    <br>
> getAllFive(work);         ------336   <br>
> getAllSix(work);          ------1645    <br>
> getAllSeven(work);        ------4369    <br>
> getAllEight(work);        ------5889    <br>
> getAllNine(work);         ------2718    <br>
> getAllTen(work);          ------0   <br>

### 小结：
---
## 火力网问题
### 题干：
> 在一个n*n的网格里，每个网格可能为“墙壁”和“街道”。现在在街道放置碉堡，每个碉
> 堡可以向上下左右四个方向开火。子弹射程无限远，墙壁可以阻挡子弹。问最多能放置
> 多少个碉堡，使它们彼此不会互相摧毁。
> 假设黑正方形表示墙壁，空白正方形表示街道，圆球代表碉堡。图B的碉堡放置是正确的，
> 图C的碉堡放置是错误的。因为图C在某一行或者某一列有两个碉堡，这样他们就会互相攻击。
### 算法：
### 代码：
### 结果：
### 小结：