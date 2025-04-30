import java.io.*;
import java.util.*;

public class PokerSatuKartu {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x == y){
            System.out.println("Draw");
        }
        else if (x == 1){
            System.out.println("Alice");
        }
        else if (y == 1){
            System.out.println("Bob");
        }
        else if (x > y){
            System.out.println("Alice");
        }
        else if (x < y){
            System.out.println("Bob");
        }
    }
}