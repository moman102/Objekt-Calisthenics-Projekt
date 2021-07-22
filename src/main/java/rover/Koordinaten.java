package rover;

public class Koordinaten { // TODO: Singular...
    private int aktuellePosition ;

    public Koordinaten(int aktuellePosition){
        this.aktuellePosition = aktuellePosition;
    }

    public Koordinaten bewegungRecht(){
        return new Koordinaten(aktuellePosition + 1);
    }
    public Koordinaten bewegungLinks(){
        return new Koordinaten(aktuellePosition - 1);
    }
    public Koordinaten bewegungOben(){
        return new Koordinaten(aktuellePosition - 50);
    }
    public Koordinaten bewegungUnten(){
        return new Koordinaten(aktuellePosition + 50);
    }

    @Override
    public boolean equals(Object obj) {
        Koordinaten koordinaten =(Koordinaten) obj;
        return aktuellePosition==koordinaten.aktuellePosition;
    }
}