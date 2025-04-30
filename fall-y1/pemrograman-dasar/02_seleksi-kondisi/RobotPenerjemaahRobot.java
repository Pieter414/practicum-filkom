import java.io.*;
import java.util.*;

public class RobotPenerjemaahRobot {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int dt = sc.nextInt();
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();
        switch(dt){
            case 1:
                System.out.print("Minggu, ");
                break;
            case 2:
                System.out.print("Senin, ");
                break;
            case 3:
                System.out.print("Selasa, ");
                break;
            case 4:
                System.out.print("Rabu, ");
                break;
            case 5:
                System.out.print("Kamis, ");
                break;
            case 6:
                System.out.print("Jumat, ");
                break;
            case 7:
                System.out.print("Sabtu, ");
                break;
        }
        System.out.print(dd+" ");
        switch(mm){
            case 1:
                System.out.print("Januari ");
                break;
            case 2:
                System.out.print("Februari ");
                break;
            case 3:
                System.out.print("Maret ");
                break;
            case 4:
                System.out.print("April ");
                break;
            case 5:
                System.out.print("Mei ");
                break;
            case 6:
                System.out.print("Juni ");
                break;
            case 7:
                System.out.print("Juli ");
                break;
            case 8:
                System.out.print("Agustus ");
                break;
            case 9:
                System.out.print("September ");
                break;
            case 10:
                System.out.print("Oktober ");
                break;
            case 11:
                System.out.print("November ");
                break;
            case 12:
                System.out.print("Desember ");
                break;
        }
        System.out.print(yy);
    }
}