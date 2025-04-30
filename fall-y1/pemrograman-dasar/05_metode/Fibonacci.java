import java.io.*;
import java.util.*;

public class Fibonacci {
    
    public static boolean check(String s){
        for (char c : s.toCharArray()){
            if (c < 48 || c > 57) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] item = s.split(" ");
        double count = 0;
        int i = 0;
        if (check(item[i])){
            count += (double) item[i].charAt(0) - 48;
        }
        else if (item[i].charAt(item[i].length()-1) == '!'){
            // System.out.println(item[i+1].charAt(item[i+1].length()-1));
            count += fact(Double.parseDouble(item[i].substring(0, item[i].length()-1)));
        }
        else if (item[i].substring(0,3).equals("fib")){
            count += fib(Double.parseDouble(item[i].substring(3)));
        }
        for (i = 1; i < item.length-1; i+=2){
            // System.out.println(item[i+1]);
            if (item[i].equals("+")){
                if (check(item[i+1])){
                    count += Double.parseDouble(item[i+1]);
                }
                else if (item[i+1].charAt(item[i+1].length()-1) == '!'){
                    // System.out.println(item[i+1].charAt(item[i+1].length()-1));
                    count += fact(Double.parseDouble(item[i+1].substring(0, item[i+1].length()-1)));
                }
                else if (item[i+1].substring(0,3).equals("fib")){
                    count += fib(Double.parseDouble(item[i+1].substring(3)));
                }
            }
            else if (item[i].equals("-")){
                if (check(item[i+1])) {
                    count -= Double.parseDouble(item[i+1]);
                }
                else if (item[i+1].charAt(item[i+1].length()-1) == '!'){
                    // System.out.println(item[i+1].charAt(item[i+1].length()-1));
                    count -= fact(Double.parseDouble(item[i+1].substring(0, item[i+1].length()-1)));
                }
                else if (item[i+1].substring(0,3).equals("fib")){
                    count -= fib(Double.parseDouble(item[i+1].substring(3)));
                }
            }
        }
        System.out.printf("%.0f\n", count);
    }
    
    public static double fact(double n){
        if (n <= 1) return 1;
        else return n * fact(n - 1);
    }
    
    public static double fib(double n){
        if (n == 0 || n == 1) return n;
        else return fib(n - 1) + fib (n - 2);
    }
}