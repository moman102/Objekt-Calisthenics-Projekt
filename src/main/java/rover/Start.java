package rover;
import Planet.Mars;
import java.io.PrintStream;


public class Start {

  public static void main(String[] args) {

	  PrintStream out = System.out ;

	  Mars mars = new Mars();

	  Orientierung nord = new Nord();

	  Rover rover = new Rover(new Koordinaten(750/2),nord);

	  mars.Mapinitialisierung();

	  mars.printMap(out);

	  rover.bewegRover(mars,out);

	  rover.rotateRover(mars,out);

	  rover.bewegRover(mars,out);


  }
}