import java.util.*;

public class KelipatanAtauBukan {
    public static void main(String[] args) {
        // Lengkapi Kode Berikut:
          // Deklarasi Scanner
              Scanner sc = new Scanner(System.in);
          // Deklarasi Variabel
              int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x == 0){
            System.out.println("nol");
        }
        else if (x % y == 0) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
    }
}