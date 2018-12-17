import java.lang.reflect.Array;
import java.util.Arrays;


//TODO ADD DRAW OPTION. ADD END GAME.


public class MapaPlanszy {

    private Znak[][] plansza;


    public MapaPlanszy() {
        this.plansza = new Znak[3][3];

        for (Znak[] row : plansza)
            Arrays.fill(row, Znak.PUSTY);


    }


    public boolean stillInGameNot() {       //POZIOM


        if (plansza[0][0].equals(plansza[0][1]) && plansza[0][0].equals(plansza[0][2]) && !(plansza[0][0].equals(Znak.PUSTY)) ||
                plansza[1][0].equals(plansza[1][1]) && plansza[1][0].equals(plansza[1][2]) && !(plansza[1][0].equals(Znak.PUSTY)) ||
                plansza[2][0].equals(plansza[2][1]) && plansza[2][0].equals(plansza[2][2]) && !(plansza[2][0].equals(Znak.PUSTY)) ||
                //PION
                plansza[0][0].equals(plansza[1][0]) && plansza[1][0].equals(plansza[2][0]) && !(plansza[0][0].equals(Znak.PUSTY)) ||
                plansza[0][1].equals(plansza[1][1]) && plansza[1][1].equals(plansza[2][1]) && !(plansza[0][1].equals(Znak.PUSTY)) ||
                plansza[0][2].equals(plansza[1][2]) && plansza[1][2].equals(plansza[2][2]) && !(plansza[0][2].equals(Znak.PUSTY)) ||
                //UKOS
                plansza[0][0].equals(plansza[1][1]) && plansza[1][1].equals(plansza[2][2]) && !(plansza[0][0].equals(Znak.PUSTY)) ||
                plansza[2][0].equals(plansza[1][1]) && plansza[0][0].equals(plansza[0][2]) && !(plansza[2][0].equals(Znak.PUSTY))
        ) {
            return true;
        }


        return false;
    }


    public void setPole(int i, int j, Znak znak) {
        this.plansza[i][j] = znak;
    }


    public Znak getPole(int i, int j) {
        return this.plansza[i][j];
    }


    public void clearPlansza() {
        this.plansza = new Znak[3][3];
    }


}
