package rover;

import Planet.Objekt;

public class Sud implements Orientierung {
    @Override
    public Objekt print() {
        return new Objekt('v');
    }

    @Override
    public Orientierung nextOrientierung() {
        return new West();
    }

    @Override
    public Koordinaten nextKoordinaten(Koordinaten roverPosition) {
        return roverPosition.bewegungUnten();
    }
}