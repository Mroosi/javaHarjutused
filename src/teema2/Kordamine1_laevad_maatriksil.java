package teema2;

import java.lang.Exception;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    static int[][] laud;
    static int laualaius = 4;
    static int lauakõrgus = 4;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //genereeri laud()//
        //laevadeGenereerimin()//
        //Kysipommitamisasukohta//
        //kontrolli tabamust//
        //tagasiside, kas läks pihta//
        //kas on veel alles laevu//
        //game over//
        genereeriLaud();
        laevadeGenereerimine();
        int[] xy = kysipommitamisasukohta();
        kontrolliTabamust(xy);
    }

    private static void kontrolliTabamust(int[] xy) {
        int x = xy[0];
        int y = xy[1];
        int sp = laud[y][x];
        if (sp == 1){
            System.out.println("pihtas");
            laud [y][x] = 2;
        }else if (sp== 0){
            System.out.println("mööda");
        }

    }

    private static int[] kysipommitamisasukohta() {
        try {
            System.out.println("Ütle rea number!");
            int x = sc.nextInt() - 1;
            System.out.println("Ütle veeru number!");
            int y = sc.nextInt() - 1;
            int[] xy = {x, y};
            return xy;
        }catch (Exception e){
            System.out.println("Kirjuta ikka number!");
        }
        return kysipommitamisasukohta();
    }
    public static void laevadeGenereerimine() {
        for (int i = 0; i < lauakõrgus; i++){
            for (int j = 0; j < laualaius; j++){
                laud[i][j] = (int) (Math.random() * 2) ;

            }
            System.out.println(Arrays.toString(laud[i]));

        }
    }

    public static void genereeriLaud() {
        laud = new int[4][4];

    }
}
