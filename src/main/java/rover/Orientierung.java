package rover;

import Planet.Objekt;

public interface Orientierung {

     Objekt print();

     Orientierung nextOrientierung();

     Koordinaten nextKoordinaten(Koordinaten roverPosition);
}
