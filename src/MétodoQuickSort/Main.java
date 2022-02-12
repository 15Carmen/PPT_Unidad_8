package MétodoQuickSort;


public class Main {
    public static void main(String[] args) {
        int[] miArray={10,40,7,9,15,27};
        QuickSort.quicksort(miArray, 0, miArray.length-1);

        for (int elemento:miArray) {
            System.out.println(elemento);

        }

    }
}
