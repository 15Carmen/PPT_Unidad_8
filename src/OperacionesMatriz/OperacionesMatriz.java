package OperacionesMatriz;

import java.util.Scanner;

public class OperacionesMatriz {
    static final int NUMFILAS = 3;
    static final int NUMCOLS = 4;
    static int[][] mi_matriz= new int[NUMFILAS][NUMCOLS];

    public static void main(String[] args) {
//llenar la matriz por teclado
        leoYLleno();
// recorrer la matriz por filas
        recorrerPorfilas();
// recorrer la matriz por columnas
        recorrerPorcolumnas();
// recorrer la matriz en diagonal
        recorrerEndiagonal();


    }

    private static void recorrerEndiagonal() {
        System.out.println("recorremos en diagonal");
        int i=0, j=0;
        while (i<NUMFILAS && j<NUMCOLS){
            System.out.println("el elemento de la posición [" + i + "][" + j + "] es: " + mi_matriz[i][j]);
            i++;
            j++;
            }
        }


    private static void recorrerPorcolumnas() {
        System.out.println("recorremos por columnas");
        for (int i = 0; i < NUMFILAS; i++) {
            for (int j = 0; j < NUMCOLS; j++) {
                System.out.println("el elemento de la posición [" + j + "][" + i + "] es: " + mi_matriz[i][j]);

            }
        }
    }

    private static void recorrerPorfilas() {
        System.out.println("recorremos por filas");
        for (int i = 0; i < NUMFILAS; i++) {
            for (int j = 0; j < NUMCOLS; j++) {
                System.out.println("el elemento de la posición [" + i + "][" + j + "] es: " + mi_matriz[i][j]);

            }
        }
    }
    private static void leoYLleno() {
        Scanner scanner = new Scanner(System.in);
        boolean error;
        int teclado;
        for (int i = 0; i < NUMFILAS; i++) {
            for (int j = 0; j < NUMCOLS; j++) {
                error = true;
                while (error) {
                    try {
                        System.out.println("introduzca el número de la posición " + i + "," + j);
                        teclado = scanner.nextInt();
                        mi_matriz[i][j] = teclado;
                        error = false;
                    } catch (Exception e) {
                        System.out.println("solo puede introducir números sin decimales");
                        scanner.nextLine();
                        error = true;
                    }
                }
            }
        }
    }
}