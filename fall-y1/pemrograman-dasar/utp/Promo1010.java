import java.util.Scanner;

public class Promo1010 {

    public static void main(String[] argf) {
        /* Tuliskan kode kalian di sini */
        Scanner sc = new Scanner(System.in);
        int hargaA = 20000, hargaS = 28000, hargaV = 23000, hargaCap = 31000, hargaM = 35000;
        int diskon = 0;
        double total = 0, totalA = 0, totalKs = 0, totalKv = 0, totalC = 0, totalM = 0;
        
        int a = sc.nextInt();
        int ks = sc.nextInt();
        int kv = sc.nextInt();
        int c = sc.nextInt();
        int mr = sc.nextInt();
        
        if (a > 3){
            diskon = 5;
        }
        
        totalA = (hargaA * a) * (100-diskon)/100.0;
        total += totalA;
        diskon = 0;
        
        if (ks > 2){
            diskon = 8;
        }
        totalKs = (hargaS * ks) * (100-diskon)/100.0;
        total += totalKs;
        diskon = 0;
        
        if (kv > 4){
            diskon = 12;
        }
        totalKv = (hargaV * kv) * (100-diskon)/100.0;
        diskon = 0;
        
        totalC = (hargaCap * c);
        total += totalC + totalKv;
        
        totalM = (hargaM * mr);
        if (mr > 2){
            totalM -= 10000;
            
        }
        
        total += totalM;
        System.out.printf("Harga total americano    : Rp%.1f\n", totalA);
        System.out.printf("Harga total kopi susu    : Rp%.1f\n", totalKs);
        System.out.printf("Harga total kopi vietnam : Rp%.1f\n", totalKv);
        System.out.printf("Harga total cappucino    : Rp%.1f\n", totalC);
        System.out.printf("Harga total mocha rum    : Rp%.1f\n", totalM);
        System.out.println("=====================================");
        System.out.printf("Total harga pesanan      : Rp%.1f\n", total);
        if (total >= 250000){
            total = total * 90 / 100.0;
        }
        System.out.printf("Harga yang harus dibayar : Rp%.1f\n", total);
    }
}