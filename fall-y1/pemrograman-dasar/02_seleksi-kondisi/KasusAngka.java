import java.util.*;

public class KasusAngka {
    public static void main(String[] args) {
        // Deklarasi Scanner
          Scanner sc = new Scanner(System.in);
          // Disarankan menggunakan switch-case
        String s = sc.nextLine();
        int x = s.length();
        switch(x){
            case 1:
                System.out.println("satuan");
                break;
            case 2:
                System.out.println("puluhan");
                break;
            case 3:
                System.out.println("ratusan");
                break;
            case 4:
                System.out.println("ribuan");
                break;
            case 5:
                System.out.println("puluhribuan");
                break;
            case 6:
                System.out.println("ratusribuan");
                break;
            default :
                System.out.println("takhingga");
                break;
        }
        
    }
}