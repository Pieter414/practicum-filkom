import java.util.*;

public class RankingPemain {
    public static void printItem(int[] off, int[] def){
        System.out.print("Skill ofensif: ");
        for (int i = 0; i < off.length; i++) System.out.print(off[i]+" ");
        System.out.print("\nSkill defensif: ");
        for (int i = 0; i < def.length; i++) System.out.print(def[i]+" ");
        System.out.println();
    }
    
    public static void printItem(int[] off, int[] def, int[] total){
        System.out.print("Rank ofensif: ");
        for (int i = 0; i < off.length; i++) System.out.print(off[i]+" ");
        System.out.print("\nRank defensif: ");
        for (int i = 0; i < def.length; i++) System.out.print(def[i]+" ");
        System.out.print("\nRank overall: ");
        for (int i = 0; i < total.length; i++) System.out.print(total[i]+" ");
        System.out.println();
    }
    
    public static int[][] rankPlayer(int[][] ranking, int[][] data){
        for (int i = 0; i < ranking.length; i++){
            // ArrayList<Integer> test = new ArrayList<Integer>(data.get(i));
            int[] test = data[i].clone();
            int rank = 1;
            int x = 0;
            int max = Integer.MIN_VALUE;
            // int min = Integer.MAX_VALUE;
            for (int h = 0; h < ranking[0].length; h++){
                if (i != 2) {
                    for (int j = 0; j < test.length; j++) max = Math.max(test[j], max);
                    for (int j = 0; j < test.length; j++){
                        // System.out.println(Arrays.toString(data[i]));
                        if (test[j] == -1) continue;
                        if (test[j] == max){
                            if (x >= 2 && i == 2) continue;
                            // System.out.println(ranking.get(i));
                            ranking[i][j] = rank;
                            test[j] = -1;
                            x++;
                        }
                    }
                }
                else {
                    int[] ranked = new int[ranking[0].length];
                    for (int j = 0; j < ranked.length; j++){
                        ranked[j] = ranking[0][j] + ranking[1][j];
                    }
                    data[i] = ranked;
                    ranking[i] = rankOverall(ranked);
                    break;
                }
                rank += x;
                x = 0;
                max = Integer.MIN_VALUE;
                // min = Integer.MAX_VALUE;
                }
            }
        return ranking;
    }
    
    public static int[] rankOverall(int[] total){
        int min = Integer.MAX_VALUE;
        int rank = 1, x = 0;
        int[] ranking = total.clone();
        for (int i = 0; i < total.length; i++){
            for (int j = 0; j < total.length; j++) {
                if (total[j] == -1) continue;
                min = Math.min(total[j], min);
            }
            // System.out.println(min);
            // System.out.println(Arrays.toString(total));
            for (int j = 0; j < total.length; j++){
                if (total[j] == -1) continue;
                if (total[j] == min){
                    ranking[j] = rank;
                    total[j] = -1;
                    x++;
                }
            }
            rank += x;
            x = 0;
            min = Integer.MAX_VALUE;
        }
        return ranking;
    }

    
    public static void main(String[] argp) {
        /* Tuliskan kode kalian di sini */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] off = new int[x];
        int[] def = new int[x];
        int[] total = new int[x];
        int[][] ranking = new int[3][x];
        int[][] data = new int[3][x];
        // ArrayList<ArrayList<Integer>> ranking =  new ArrayList<ArrayList<Integer>>();
        // ArrayList<ArrayList<Integer>> data =  new ArrayList<ArrayList<Integer>>();
        // System.out.println(ranking);
        for (int i = 0; i < x ; i++){
            off[i] = sc.nextInt();
        }
        for (int i = 0; i < x ; i++){
            def[i] = sc.nextInt();
        }
        for (int i = 0; i < x ; i++){
            total[i] = off[i] + def[i];
        }
        int y = sc.nextInt();
        for (int i = 0; i < y; i++){
            int count = 0;
            String s = sc.next();
            if (s.equals("tampil")){
                String item = sc.next();
                if (item.equals("skill")){
                    printItem(off, def);
                }
                else if (item.equals("rank")){
                    data[0] = off.clone();
                    data[1] = def.clone();
                    data[2] = total.clone();
                    ranking = rankPlayer(ranking, data);
                    printItem(ranking[0], ranking[1], ranking[2]);
                }
            }
            else if (s.equals("latih")){
                String skill = sc.next();
                int index = sc.nextInt()-1;
                int point = sc.nextInt();
                if (skill.equals("ofensif")){
                    off[index] += point;
                    def[index] -= (int) Math.floor(point/2.0);
                }
                else if (skill.equals("defensif")){
                    def[index] += point;
                    off[index] -= (int) Math.floor(point/2.0);
                }
                total[index] =  off[index] + def[index];
                System.out.printf("Melatih skill %s pemain ke-%d sebanyak %d poin\n", skill, index+1, point);
            }
        }
    }
}