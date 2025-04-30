import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Valo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> all = new ArrayList<Integer>();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arrX = new int[x];
        // ArrayList<Integer> arrX = new ArrayList<Integer>();
        for (int i = 0; i < x; i++){
            arrX[i] = sc.nextInt();
            all.add(arrX[i]);
            // System.out.println(arrX[i]);
        }
        int[] arrY = new int[y];
        // ArrayList<Integer> arrY = new ArrayList<Integer>();
        for (int i = 0; i < y; i++){
            arrY[i] = sc.nextInt();
            all.add(arrY[i]);
        }
        Collections.sort(all, Collections.reverseOrder());
        // Collections.sort(arrX, Collections.reverseOrder());    
        // Collections.sort(arrY, Collections.reverseOrder());  
        System.out.printf("%-5s|| %s\n", "Team", "Score");
        System.out.println("=============");
        int a = 0, b = 0;
        // while (a <= arrX.size() && b <= arrY.size()){
        //     System.out.println(arrX.get(a));
        //     if (arrX.get(a) > arrY.get(b)){
        //         System.out.printf("%-5d|| %d\n", 1, arrX.get(a));
        //         a++;
        //     }
        //     else if (arrX.get(a) < arrY.get(b)){
        //         System.out.printf("%-5d|| %d\n", 2, arrY.get(b));
        //         b++;
        //     }
        // }
        for (int i = 0; i < all.size(); i++){
            // int team = 0;
            boolean yes = true;
            for (int j = 0; j < arrX.length; j++){
                if (all.get(i) == arrX[j]) {
                    System.out.printf("%-5d|| %d\n", 1, all.get(i));
                }
            }
            for (int j = 0; j < arrY.length; j++){
                if (!yes) break;
                if (all.get(i) == arrY[j]) 
                System.out.printf("%-5d|| %d\n", 2, all.get(i));
                
            }
            // System.out.printf("%-5d|| %d\n", team, all.get(i));
        }
    }
}