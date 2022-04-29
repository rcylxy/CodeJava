package FinalTest;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Classname Work3
 * @Date 2022/4/28 11:01
 * @Created by 李晓阳
 */
public class Work3 {
    private static final char wall = 'W';                               //墙位置的字符
    private static final char empty = 'E';                              //空白位置的字符
    private static final char occupyChar = '#';                         //标记占据过的位置
    private static int lengthOfArray;                                   //用户输入的大小
    private static int ret;                                             //最后返回的结果
    private static final int MAXSIZE = 150;                             //深度搜索得最大size
    private static final char[][] Map = new char[MAXSIZE][MAXSIZE];     //地图数组，用于深度搜索

    public static boolean coordinateCheck(int xToCheck, int yToCheck) {
        for (int i = xToCheck - 1; i >= 0; i--) {
            if (wall == Map[i][yToCheck]) {
                break;
            }
            if (occupyChar == Map[i][yToCheck]) {
                return false;
            }
        }

        for (int j = yToCheck - 1; j >= 0; j--) {
            if (Map[xToCheck][j] == wall) {
                break;
            }

            if (Map[xToCheck][j] == occupyChar) {
                return false;
            }
        }
        return true;
    }

    public static void DFS(int currentPosition, int temp) {
        int xCoordinate;
        int yCoordinate;
        if (currentPosition >= lengthOfArray * lengthOfArray) {
            ret = Math.max(ret, temp);
        } else if (currentPosition < lengthOfArray * lengthOfArray) {
            //得到该次递归的坐标
            xCoordinate = currentPosition / lengthOfArray;
            yCoordinate = currentPosition % lengthOfArray;
            if (empty == Map[xCoordinate][yCoordinate]) {
                if (coordinateCheck(xCoordinate, yCoordinate)) {
                    Map[xCoordinate][yCoordinate] = occupyChar;
                    DFS(currentPosition + 1, temp + 1);
                    Map[xCoordinate][yCoordinate] = empty;
                }
            }
            DFS(currentPosition + 1, temp);
        }

    }

    public static void main(String[] args) throws IOException {
        //读入整个数组的大小
        System.out.println("请输入整个数组的大小：");
        Scanner in = new Scanner(System.in);
        lengthOfArray = in.nextInt();
        //读入整个数组
        System.out.println("用W代表墙，用E代表空白，初始化一个" + lengthOfArray + "*" + lengthOfArray + "的数组：");
        for (int i = 0; i < lengthOfArray; ++i) {
            for (int j = 0; j < lengthOfArray; ++j) {
                Map[i][j] = (char) System.in.read();
            }
        }
        DFS(0, 0);
        System.out.println("根据深度优先搜索，得到的最大的可以放置的火力的个数是：" + ret);
    }

}
