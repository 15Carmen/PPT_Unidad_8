package InsertarOrden;

public class InsertOrden {
    public static int insertOrden(int[] miarray, int dato, int posVal) {
        int nuevaLong = -1; //fracaso
        int indice = 0;
        if (dato > miarray[posVal]) {//lo inserto al final
            miarray[posVal+1] = dato;
        } else {
            if (dato < miarray[0]) {//lo inserto al principio y desplazo todo una posición al final
                for (int i = posVal; i >= 0; i--) {
                    miarray[i+1] = miarray[i];
                }
                miarray[0] = dato;
            } else { //busco el sitio
                while (miarray[indice] <= dato) {
                    indice++;
                }//hago hueco
                for (int i = posVal; i >= indice; i--) {
                    miarray[i+1] = miarray[i];
                }
                miarray[indice] = dato;
            }
        }

        return ( posVal+1 );
    }
}
