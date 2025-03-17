public class SelectionDemo {

    // Metode generik untuk selection sort dalam urutan menurun (descending order)
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {
            int largeIndex = pass;

            // Cari elemen terbesar di subarray
            for (int j = pass + 1; j < n; j++) {
                if (arr[j].compareTo(arr[largeIndex]) > 0) { // Bandingkan untuk descending order
                    largeIndex = j;
                }
            }

            // Tukar elemen terbesar dengan elemen di posisi 'pass'
            T temp = arr[pass];
            arr[pass] = arr[largeIndex];
            arr[largeIndex] = temp;
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

