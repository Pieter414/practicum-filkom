import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SegitigaAngka {

    public static void main(String[] args) {
        /* Semangat <3 */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPrime = true;
        int n = 0;
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                isPrime = false;
            }
        }
        if (!isPrime){
            for (int i = 0; i < x; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print(n+" ");
                    n++;
                    if (n > 9){
                        n = 0;
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Maaf, tidak bisa menggunakan bilangan ini!");
        }
        
    }
}