
public class Sorting2 {
    // Fields to hold the data
    private int[] data;
    private int size;

    // --- NEW Constructor ---
    // This allows us to pass our array to the class
    public Sorting2(int[] inputArray) {
        this.data = inputArray;
        this.size = inputArray.length;
    }

    // --- STEP 1: Add the insertionSort method ---
    // This code is taken directly from the image
    public void insertionSort() {
        // Start from the second element (index 1)
        for (int i = 1; i < size; i++) {
            int key = data[i]; // The element we are inserting
            int j = i - 1;     // The last element of the sorted section

            // Move elements of data[0...i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            // Insert the key at its correct position
            data[j + 1] = key;
        }
    }

    // --- Helper Method: print ---
    // (Notice your instruction sheet called it "display" but used ".print()"
    // in the code snippet. I will use print() to match the snippet.)
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(); // New line after printing the array
    }
}