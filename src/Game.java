import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {


    private Gracz player1;
    private Gracz player2;
    private Plansza plansza;
    private MapaPlanszy rozkladPionkow;


    public void start() {


        System.out.println("Gracz pierwszy imie?");

        this.player1 = new Gracz("Gracz 1");
        player1.setZnak(Znak.KOLKO);


        System.out.println("Gracz drugi imie? ");

        this.player2 = new Gracz("Gracz 2");
        player2.setZnak(Znak.KRZYZYK);


        rozkladPionkow = new MapaPlanszy();
        plansza = new Plansza();
        plansza.rysuj(rozkladPionkow);


        while (true) {

            System.out.println("Gracz pierwszy ruch?");
            this.playersTurn(Znak.KRZYZYK);
            if (rozkladPionkow.stillInGameNot()) {
                System.out.print("Wygrał gracz 1");
                break;
            }


        }


    }


    public Znak playersTurn(Znak znak) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = input.readLine();
            String[] sign = inputString.split(",");
            System.out.println(sign[0]);

            rozkladPionkow.setPole(Integer.parseInt(sign[0]), Integer.parseInt(sign[1]), znak);
        } catch (IOException e) {
            e.printStackTrace();
        }
        plansza.rysuj(rozkladPionkow);

        return znak;
    }


}
