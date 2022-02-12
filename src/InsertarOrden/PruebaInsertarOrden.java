package InsertarOrden;

public class PruebaInsertarOrden {
    public static void main(String[] args) {

        int[] miArray = {1, 2, 29, 30,31,32,0,0,0};
        int longitud = InsertOrden.insertOrden(miArray, 0, 5);
        if (longitud == -1) {
            System.out.println("no se ha posido insertar");
        } else {

            for (int elemento : miArray) {
                System.out.println(elemento);

            }

        }
    }
}