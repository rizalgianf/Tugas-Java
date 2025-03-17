public class InsertionDemo {

    // Metode generik untuk insertion sort
    public static <T extends Comparable<T>> void insertionSort(T[] A) {
        for (int i = 1; i < A.length; i++) {
            T key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j].compareTo(key) > 0) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    // Metode generik untuk menampilkan array
    public static <T> void tampil(T[] data) {
        for (T element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Integer A[] = {10, 6, 8, 3, 1};
        InsertionDemo.tampil(A);
        InsertionDemo.insertionSort(A);
        InsertionDemo.tampil(A);
    }
}
