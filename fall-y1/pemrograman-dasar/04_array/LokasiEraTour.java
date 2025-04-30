import java.io.*;
import java.util.*;

public class LokasiEraTour {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] m = new int[x][y];
        int max = Integer.MIN_VALUE;
        int korX = 0, korY = 0;;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = sc.nextInt();
            }
        }
        for (int g = 1; g < m.length-1; g++){
            for (int h = 1; h < m[g].length-1; h++){
                int sum = 0;
                for (int i = g-1; i < g+2; i++){
                    for (int j = h-1; j < h+2; j++){
                        sum += m[i][j]; 
                    }
                }
                // System.out.println(sum);
                int prevMax = max;
                max = Math.max(max, sum);
                if (max == sum && max != prevMax){
                    korX = h;
                    korY = g;
                }
            }
        }
        System.out.printf("Popularitas: %d di koordinat: [%d, %d]", max, korX, korY);
    }
}