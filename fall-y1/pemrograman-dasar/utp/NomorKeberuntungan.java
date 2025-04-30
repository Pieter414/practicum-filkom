import java.util.Scanner;

public class NomorKeberuntungan {

    public static void main(String[] argz) {
        /* Tuliskan kode kalian di sini */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int selisih = max - min;
        System.out.println("Terbesar "+max);
        System.out.println("Terkecil "+min);
        System.out.printf("Selisih %d - %d = %d\n", max, min, selisih);
        if (selisih % 2 != 0 && selisih % 3 != 0 && selisih % 5 != 0 && selisih % 7 != 0 && selisih % 11 != 0){
            System.out.println("Tidak ada");
            System.out.println("Jackpot!!!");
        }
        else if (selisih % 2 == 0 && selisih % 3 == 0 && selisih % 5 == 0 && selisih % 7 == 0 && selisih % 11 == 0){
            System.out.println("Habis dibagi 2 3 5 7 11");
            System.out.println("Jackpot!!!");
        }
        else {
            System.out.print("Habis dibagi ");
            if (selisih % 2 == 0){
                System.out.print("2 ");
            }
            if (selisih % 3 == 0){
                System.out.print("3 ");
            }
            if (selisih % 5 == 0){
                System.out.print("5 ");
            }
            if (selisih % 7 == 0){
                System.out.print("7 ");
            }
            if (selisih % 11 == 0){
                System.out.print("11 ");
            }

            System.out.println("\nBelum hoki!");
        }
    }
}