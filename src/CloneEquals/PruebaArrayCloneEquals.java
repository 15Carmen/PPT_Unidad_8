package CloneEquals;
import java.util.Scanner;
import java.io .*;

public class PruebaArrayCloneEquals implements Cloneable {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

// copia se inicializa con los mismos datos de array
// usando el método clone
        int[] copia = (int[]) array.clone();
        if (array.equals(copia))
            System.out.println("Es el mismo array");
        else
            System.out.println("Son arrays distintos");
        copia = array; // ahora referenciaran al mismo array
        if (array.equals(copia))
            System.out.println("Es el mismo array");
        else
            System.out.println("Son arrys distintos");
    }

    public Object clone(){
        Object o=clone();
        return o;
    }
}

