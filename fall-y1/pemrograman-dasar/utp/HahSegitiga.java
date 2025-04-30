import java.util.Scanner;

public class HahSegitiga {

    public static void main(String[] argt) {
        /* Tuliskan kode kalian di sini */
        Scanner sc = new Scanner(System.in);
        double temp;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c){
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }
        
        if (a == b && b == c && c == a){
            System.out.println("Segitiga sama sisi");
        }
        else if (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)){
            System.out.println("Segitiga siku-siku");
        }
        else if (b == c && b != a || a == b && a != c || a == c && a != b){
            System.out.println("Segitiga sama kaki");
        }
        else {
            System.out.println("Segitiga sembarang");
        }
    }
}