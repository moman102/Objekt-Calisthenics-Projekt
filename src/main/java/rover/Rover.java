package rover;


import Planet.Mars;
import Planet.Objekt;

import java.io.PrintStream;

public class Rover {

	private Orientierung roverOrientation;
	private Koordinaten  roverKoordinaten ;

	public Rover(Koordinaten roverKoordinaten,Orientierung roverOrientation) {
		this.roverKoordinaten = roverKoordinaten;
		this.roverOrientation=roverOrientation;
	}

	public void rotateRover(Mars mars,PrintStream out) {
		roverOrientation = roverOrientation.nextOrientierung() ;
		Objekt newOrientierung = roverOrientation.print();
		mars.roverNachRotation(newOrientierung);
		mars.printMap(out);
	}

	public void bewegRover(Mars mars,PrintStream out) {
		Koordinaten newkoordinate = roverOrientation.nextKoordinaten(roverKoordinaten);
		roverKoordinaten = mars.roverNachBewegung(newkoordinate);
		mars.printMap(out);

	}
}
