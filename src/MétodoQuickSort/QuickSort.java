package MétodoQuickSort;

public class QuickSort {

    public static void quicksort(int Array[], int izq, int der) {

        int pivote=Array[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen los índices de las búsquedas
// busca con el índice que se recorre la parte izquierda un número mayor que el pivote hasta que lo encuntra
// o se cruza con el otro índcie
            while(Array[i] <= pivote && i < j)
                i++;
//Busca en la parte derecha hasta que encuentra un número menor que el pivote
            while(Array[j] > pivote)
                j--;
//si se ha encontrado un número mayor que el pivote en la parte izquierda y otro menor en la parte derecha
// y no se han cruzado los índices, entonces se intercambian los números encontrados para dejar en la parte
//derecha el mayor y en la izquierda el menor
            if (i < j) {
                aux= Array[i];
                Array[i]=Array[j];
                Array[j]=aux;
            }
        }

        Array[izq]=Array[j];      // se coloca el pivote en su lugar de forma que tendremos
        Array[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(Array,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(Array,j+1,der);          // ordenamos subarray derecho

    }

}
