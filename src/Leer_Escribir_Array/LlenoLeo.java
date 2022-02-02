package Leer_Escribir_Array;

import java.util.Scanner;

public class LlenoLeo {

    //se leen por teclado los datos del array y se muestran los pares
public static void main(String[] args) {
    int[] lista= new int[10];
    Scanner sc=new Scanner(System.in);
    int teclado=0;

    for (int i=0;i< lista.length;i++){
        System.out.println("introduzca el valor "+ i);
        lista[i]=sc.nextInt();
    }

    for (int i=0; i< lista.length;i++){
        if ((lista[i]%2)==0){
            System.out.println( lista[i]);

        }
    }
}
}
