import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    //    public static int SIZE = 3;
//    public static int DOTS_TO_WIN = 3;
//    public static final char DOT_EMPTY = '•';
//    public static final char DOT_X = 'X';
//    public static final char DOT_O = 'O';
//    public static char[][] map;
//    public static Scanner sc = new Scanner(System.in);
//    public static Random rand = new Random();
    //test1
    public static void main(String[] args) {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
