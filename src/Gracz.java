public class Gracz {
    String name;
    Znak znak;




    public Gracz(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public Znak getZnak() {
        return znak;
    }

    public void setZnak(Znak znak) {
        this.znak = znak;
    }
}
