package rover;

import Planet.Objekt;

public class Nord implements Orientierung{
    @Override
    public Objekt print() {
        return new Objekt('^');
    }
    @Override
    public  Orientierung nextOrientierung() {
        return new Ost();
    }

    @Override
    public Koordinaten nextKoordinaten(Koordinaten roverPosition) {
        return roverPosition.bewegungOben();
    }
}
