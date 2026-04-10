public class Sorting1 {
    private int[] data;
    private int size;

    // Constructor to initialize data from the main class
    public Sorting1(int[] input) {
        this.data = input;
        this.size = input.length;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            // Swapping the found minimum element with the first element
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}