package NotasArray;
//PruebaArray.java

import java.util.Scanner;

/**
 * clase para introducir notas por teclado. Nos valdremos del índice para el orden de los alumnos
 * las obtención e impresión de las notas las haremos en funciones aparte
 */
public class Notas {
    public static final int MAXIMO = 10;
    public static double[] misNotas = leoYLLeno(MAXIMO);

    public static void main(String[] args) {
        int i;
        muestroNotas();

    }

    private static void muestroNotas() {
        for (int i = 0; i < misNotas.length; i++)
            System.out.println("la nota del alumno " + ( i + 1 ) + " es: " + misNotas[i]);
    }

    public static double[] leoYLLeno(int max) {
        Scanner scanner = new Scanner(System.in);
        boolean error;
        double[] notas = new double[max];
        System.out.println("introduzca las notas de los alumnos. Ha de ser un valor entre 0 y 10");
        for (int i = 0; i < max; i++) {
            error = true;
            while (error) {
                try {
                    System.out.println("Nota del alumno numero " + ( i + 1 ));
                    notas[i] = scanner.nextDouble();
                    if (notas[i] >= 0 && notas[i] <= 10) {
                        error = false;
                    }
                    else{
                        System.out.println("la nota ha de estar entre 0 y 10");
                    }
                } catch (Exception e) {
                    System.out.println("has de introducir una nota entre el 0 y el 10");
                    error = true;
                    scanner.nextLine();
                }
            }
        }

        return notas;
    }
}//fin main

