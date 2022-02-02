package AumentoArray;

public class ArrayMayor {
public static void main(String[]args) {

    int[] ant = {1, 2, 3 };
    System.out.println("muestro el array original");
    int cant = 3;
    imprimo (ant);
    System.out.println();
    //voy a aumentar el array en 3 y llamo a una funcion
    ant= aumentaIntArray(ant,cant);
    ant[3]=8;
    ant[4]=9;
    ant[5]=10;
    System.out.println("muestro el array aumentado");
    imprimo (ant);
}

    /**
     * procedimiento para imprimir el array
     * @param ant
     */
    private static void imprimo(int[] ant) {
    for (int i=0; i<ant.length;i++){
        System.out.println("el valor de la posicion "+ i+ " es: "+ ant[i]);
    }
    }

    public static int[] aumentaIntArray(int[] ant, int cant){
// creo un array con la dimension nueva
        int[] nue = new int[ant.length + cant];
// copio los elementos del array anterior al recién creado
        for(int i = 0;i< ant.length; i++)
            nue[i] = ant[i];
        return (nue);


        }


}
