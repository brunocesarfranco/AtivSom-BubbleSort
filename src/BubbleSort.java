public class BubbleSort {
    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    // Troca dos elementos (Verifica se valor é maior ou menor que o proximo index)
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 8, 1, 4, 9, 0 };

        System.out.println("Array antes do Bubble Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array);// Ordenando elementos do array utilizando bubble sort

        System.out.println("Array depois do Bubble Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}