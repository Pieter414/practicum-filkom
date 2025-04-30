import java.util.*;

public class AwasRedZone {
    
    public static boolean redZone(int x1, int y1, int dX, int dY, int x, int y){
        if (x >= x1-dX && x <= x1+dX && y >= y1-dY && y <= y1+dY){
            return true;
        }
        return false;
    }
    public static void main(String[] argx) {
        /* Tuliskan kode kalian di sini */
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dX = Math.abs(x2 - x1);
        int dY = Math.abs(y2 - y1);
        boolean result1 = redZone(x1, y1, dX, dY, x, y);
        boolean result2 = redZone(x2, y2, dX, dY, x, y);
        if (result1 == result2 && result1 == true){
            System.out.println("Bahaya");
        }
        else if (result1 || result2){
            System.out.println("Hati-hati");
        }
        else{
            System.out.println("Aman");
        }
    }
}