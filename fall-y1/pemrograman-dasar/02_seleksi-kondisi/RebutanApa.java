import java.io.*;
import java.util.*;

public class RebutanApa {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char a, b;
        a = sc.nextLine().toLowerCase().charAt(0);
        b = sc.nextLine().toLowerCase().charAt(0);
        if (a == b){
            System.out.println("Mereka Berdua Tidak Pantas!");
        }
        else if (a == 'k' && b == 'b'){
            System.out.println("Augustine Menang!");
        }
        else if (a == 'b' && b == 'g'){
            System.out.println("Augustine Menang!");
        }
        else if (a == 'g' && b == 'k'){
            System.out.println("Augustine Menang!");
        }
        else if (a == 'b' && b == 'k'){
            System.out.println("Dorothea Menang!");
        }
        else if (a == 'g' && b == 'b'){
            System.out.println("Dorothea Menang!");
        }
        else if (a == 'k' && b == 'g'){
            System.out.println("Dorothea Menang!");
        }
    }
}