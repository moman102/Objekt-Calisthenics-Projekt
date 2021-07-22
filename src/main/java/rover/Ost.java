package rover;

import Planet.Objekt;

public class Ost implements Orientierung {
    @Override
    public Objekt print() {
        return new Objekt('>');
    }
    @Override
    public  Orientierung nextOrientierung() {
        return new Sud();
    }

    @Override
    public Koordinaten nextKoordinaten(Koordinaten roverPosition) {
        return roverPosition.bewegungRecht();
    }
}
