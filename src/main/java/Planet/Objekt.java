package Planet;

import java.io.PrintStream;

public class Objekt {
    private char objekt;

    public Objekt(char objekt) {
        this.objekt= objekt;
    }

    public void printObjekt(PrintStream out) {
        out.print(objekt);
    }

    @Override
    public boolean equals(Object obj) {
        Objekt object = (Objekt) obj;
        return objekt == object.objekt;

    }

}
