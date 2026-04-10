public class sorting {
    int[] data;
    int size;

    // Constructor with parameter data[]
    public sorting(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    // Bubble Sort Algorithm (Ascending)
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swapping process
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array contents
    public void print() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}