import java.util.Arrays;
import java.util.Scanner;

public class TheTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solutionA(scanner.nextInt(), scanner.nextInt());
        solutionA(1, 3);

        int[] array = {1, 2};
        System.out.println("Direct printing: " + Arrays.toString(toCalculatte(array)));

        int[] array2 = toCalculatte(array);
        System.out.println("NewVar printing: " + Arrays.toString(array2));

        //System.out.println(Arrays.deepToString(coordinates()));
     //   System.out.println(coordinates[0][2]);
    }

    public static void solutionA(int a, int b) {
        System.out.println("Soulution: " + (a + b));
    }

    public static int toCalculate(int x, int y) {
        return x + y;
    }

    public static int[] toCalculatte(int[] xarr) {
        xarr[0] += 1;
        return xarr;
    }


    public static int[][] coordinates() {

        int coArray[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
        };
        return coArray;
    }
}