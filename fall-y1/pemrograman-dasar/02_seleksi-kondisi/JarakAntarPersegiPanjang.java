import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JarakAntarPersegiPanjang {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long p, x, y, jarak;
        p = sc.nextLong();
        x = sc.nextLong();
        y = sc.nextLong();
        if ((x+p) < y){
            jarak = Math.abs(y - (p + x));
        }
        else if (x > (y+p)){
            jarak = Math.abs(x - (p + y));
        }
        else {
            jarak = 0;
        }
        System.out.println(jarak);
    }
}