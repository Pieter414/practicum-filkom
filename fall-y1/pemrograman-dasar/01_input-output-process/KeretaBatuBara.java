import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KeretaBatuBara {

    public static void main(String[] args) {
        /* Semangat yaw <3 */
        Scanner sc = new Scanner(System.in);
        double kec, jar, per;
        double hasil;
        
        kec = sc.nextDouble();
        jar = sc.nextDouble();
        per = sc.nextDouble();
        
        hasil = (double) jar / (kec * ((100-per)/100));
        System.out.printf("%.0f menit", hasil*60);
    }
}