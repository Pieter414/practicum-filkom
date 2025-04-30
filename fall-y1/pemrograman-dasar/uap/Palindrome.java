import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {

    public static String remove(String s){
        String newS = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 97 && c <= 122) newS += c;
        }
        return newS;
    }
    
    public static String reverse(String s){
        String newS = "";
        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            newS += c;
        }
        return newS;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        s = remove(s);
        if (s.equals(reverse(s))){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}