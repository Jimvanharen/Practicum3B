package practicums.practicum2B.voetbalclub;

public class Voetbalclub {

    private String voetbalclub;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String voetbalclub) {
        if (voetbalclub.equals("")){

            this.voetbalclub = "FC";
        }
        else{

            this.voetbalclub = voetbalclub;
        }
    }

    public Voetbalclub() {

    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w') {

            aantalGewonnen += 1;

        }
        if (ch == 'g') {
            aantalGelijk += 1;

        }
        if (ch == 'v') {

            aantalVerloren += 1;
        }
    }

    public int aantalPuntenOptellen() {
        return (aantalGewonnen * 3) + (aantalGelijk * 1);

    }

    public int aantalGespeeldOptellen() {

        return aantalGewonnen + aantalGelijk + aantalVerloren;

    }

    public String toString() {

        String s = voetbalclub + " " + aantalGespeeldOptellen() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPuntenOptellen();
        return s;

    }

    public String getVoetbalclub() {
        return voetbalclub;
    }

    public void setVoetbalclub(String voetbalclub) {
        this.voetbalclub = voetbalclub;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }
}