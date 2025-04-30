import java.util.Scanner;

public class BocchiGovernorGirl {

    public static void main(String[] args) {
        // Ganbatee :D
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        int[][] flood = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        flood = check(mat, x, y, flood);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(flood[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] check(int[][] mat, int x, int y, int[][] flood){
        int ori = mat[x][y];
        flood[x][y] = 1;
        if (x-1 >= 0) {
            if (mat[x-1][y] < ori) {
                flood = check(mat, x-1, y, flood);
                flood[x-1][y] = 1;
            }
        }
        if (y-1 >= 0){
            if (mat[x][y-1] < ori) {
                flood = check(mat, x, y-1, flood);
                flood[x][y-1] = 1;
            }
        }
        if (x+1 <= mat.length-1) {
            if (mat[x+1][y] < ori) {
                flood = check(mat, x+1, y, flood);
                flood[x+1][y] = 1; 
            }
        }
        if (y+1 <= mat[0].length-1){
            if (mat[x][y+1] < ori) {
                flood = check(mat, x, y+1, flood);
                flood[x][y+1] = 1;
            }
        }
        return flood;
    }
}