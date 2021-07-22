package Planet;

import rover.Koordinaten;

import java.io.PrintStream;

public class Mars { // TODO: Ähnelt Gottklasse.
    private Objekt[] mars = new Objekt[750];
    private char initialisierungHinderniss(){ // TODO: So werden Methoden nicht genannt...
        double randomDouble = ((Math.random() * 1.0) + 0.0);
        if(randomDouble < 0.25 )
           return '#';
        return ' ';
    }
    public void Mapinitialisierung(){ // TODO: So werden Methoden nicht genannt...
        for(int i = 0 ; i < mars.length ; i++){
            mars[i]=new Objekt(initialisierungHinderniss());
        }
        mars[mars.length/2]=new Objekt('^');
    }
    public void printMap(PrintStream out){
        for(int i = 0 ; i < mars.length ; i++){
            mars[i].printObjekt(out);
            nextLinie(out,i);
        }
        out.println();
        for(int i = 0 ; i < 50 ; i++)
            out.print('=');
        out.println();
    }
    private void nextLinie(PrintStream out , int i){
        if(i % 50 == 0 && i != 0)
            out.println();
    }
    private int findeRover(){
        int position = 0;
        while(mars[position].equals(new Objekt(' ')) || mars[position].equals(new Objekt('#')))
            position++;
        return position;
    }
    public Koordinaten roverNachBewegung(Koordinaten neuKoordinaten) { // TODO: Eine Art Getter.
        int altRover= findeRover();
        int i=0;
        while(! new Koordinaten(i).equals(neuKoordinaten)) {
            i++;
        }
        if(!mars[i].equals(new Objekt('#') )) {
            mars[i]= mars[findeRover()];
            mars[altRover]= new Objekt(' ');
            return(neuKoordinaten);
        }
        return(new Koordinaten(findeRover()));
    }
    public void roverNachRotation(Objekt neuOrientierung) { // TODO: Setter.
        mars[findeRover()]=neuOrientierung;
    }
}

