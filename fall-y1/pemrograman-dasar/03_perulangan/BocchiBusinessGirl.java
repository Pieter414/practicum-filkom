import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BocchiBusinessGirl {

    public static void main(String[] args) {
        /* udah sarapan belum? */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int m = sc.nextInt();
            int[] stock = new int[m];
            int adjmax = 0;
            for (int j = 0; j < m; j++){
                stock[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++){
                for (int k = j+1; k < m; k++){
                    adjmax = Math.max(adjmax, stock[j]*stock[k]);
                }
            }
            System.out.println(adjmax);
        }
    }
}