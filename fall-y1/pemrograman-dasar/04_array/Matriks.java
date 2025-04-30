import java.io.*;
import java.util.*;

public class Matriks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] m = new int[x][y];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m[0].length; i++){
            for (int j = m.length - 1; j >= 0; j--){
                // System.out.println(i+" "+j);
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
}