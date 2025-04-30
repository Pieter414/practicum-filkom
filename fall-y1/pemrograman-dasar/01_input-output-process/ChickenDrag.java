import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;

public class ChickenDrag {

    public static void main(String[] args) {
        /* Tutor deck */
        Scanner sc = new Scanner(System.in);
        String date, location, name1, name2, winner;
        double vel1, vel2;
        int minute1, sec, minute2, sec2;
        int diftime;
        double difvel;
        
        date = sc.next();
        location = sc.next();
        sc.nextLine();
        name1 = sc.nextLine();
        vel1 = sc.nextDouble();
        minute1 = sc.nextInt();
        sec = sc.nextInt();
        sc.nextLine();
        name2 = sc.nextLine();
        vel2 = sc.nextDouble();
        minute2 = sc.nextInt();
        sec2 = sc.nextInt();
        sc.nextLine();
        winner = sc.nextLine();
        
        diftime = Math.abs((minute2*60+sec2) - (minute1*60+sec));
        difvel= Math.abs(vel2 - vel1);
        
        
        System.out.println("============================================================");
        System.out.printf("%60s\n", "Chicken-Drag");
        System.out.printf("%-30s%30s\n", "Date: "+date, "Loc: "+ location);
        System.out.println("============================================================");
        System.out.printf("%-24s| %-13s| %-13s\n", "Nama", "Kecepatan", "Waktu");
        System.out.println("============================================================");
        System.out.printf("%-24s| %-13.2f| %02d:%02d\n", name1, vel1, minute1, sec);
        System.out.printf("%-24s| %-13.2f| %02d:%02d\n", name2, vel2, minute2, sec2);
        System.out.println("============================================================");
        System.out.printf("Pemenang       : %s\n", winner);
        System.out.printf("Beda Waktu     : %d detik\n", diftime);
        System.out.printf("Beda Kecepatan : %.2f m/s\n", difvel);
        
        
    }
}