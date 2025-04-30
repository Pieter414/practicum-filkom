import java.io.*;
import java.io.*;
import java.util.*;

public class HebohTukarUang {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int uang = sc.nextInt();
        int min5 = sc.nextInt();
        int min2 = sc.nextInt();
        int min1 = sc.nextInt();
        int a = min5, b = min2,c = min1;
        int sum = 0;

        while (uang > 0){
            if (uang/5 > 0){
                 while (min5 > 0 && uang >= 5){
                    uang -= 5;
                    sum++;
                    min5--;
                    // System.out.println(uang+" : 5"); 
                }
            }
            if (uang/2 > 0){
                while (min2 > 0 && uang >= 2){
                    uang -= 2;
                    sum++;
                    min2--;
                    // System.out.println(uang+" : 2"); 
                }
            }
            if (uang > 0){
                while (min1 > 0 && uang >= 1){
                    uang -= 1;
                    sum++;
                    min1--;
                    // System.out.println(uang+" : 1"); 
                }
            }
            min5 = a; min2 = b; min1 = c;
            if (uang <= 0){
                break;
            }
        }
        
    
        System.out.println(sum);
    }
}