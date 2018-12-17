import java.lang.reflect.Array;

public class Plansza {







    public void rysuj(MapaPlanszy plansza)
    {



        System.out.println(plansza.getPole(0,0) +" | " +  plansza.getPole(0,1)  +  "  |  "  + plansza.getPole(0,2)  );
        System.out.println("---------------------");
        System.out.println(plansza.getPole(1,0) +" | " + plansza.getPole(1,1)  +  "  |  "  + plansza.getPole(1,2)  );
        System.out.println("---------------------");
        System.out.println(plansza.getPole(2,0) +" | " + plansza.getPole(2,1)  +  "  |  "  + plansza.getPole(2,2)  );
    }









}
