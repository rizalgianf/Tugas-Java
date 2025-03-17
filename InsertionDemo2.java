public class InsertionDemo {

    public static void insertionSort(double[] A) {
        for (int i = 1; i < A.length; i++) {
            double key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void tampil(double data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public class Main2 {
        public static void main(String[] args) {
            double A[] = {10.3, 6.2, 8.4, 3.6, 1.1};
            InsertionDemo.tampil(A);
            InsertionDemo.insertionSort(A);
            InsertionDemo.tampil(A);
        }
    }
}
