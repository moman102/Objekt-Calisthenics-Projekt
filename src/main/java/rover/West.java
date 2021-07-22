package rover;

import Planet.Objekt;

public class West implements Orientierung {
    @Override
    public Objekt print() {
        return new Objekt('<');
    }
    @Override
    public  Orientierung nextOrientierung() {
        return new Nord();
    }

    @Override
    public Koordinaten nextKoordinaten(Koordinaten roverPosition) {
        return roverPosition.bewegungLinks();
    }
}
