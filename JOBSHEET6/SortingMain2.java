
public class SortingMain2 {
    public static void main(String[] args) {

        // --- STEP 2: Declare an array named c[] ---
        int c[] = {40, 10, 4, 9, 3};

        // --- STEP 3: Create a new object named sorting3 ---
        // (Note: The text says 'dataurut3' but the code uses 'sorting3')
        Sorting2 sorting3 = new Sorting2(c);

        // --- STEP 4: Call the methods ---
        // Part 1: Print original
        System.out.println("Original array:");
        sorting3.print();

        // Part 2: Perform the sort
        sorting3.insertionSort();

        // Part 3: Print sorted results
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();

        // --- STEP 5: Run the program ---
        // When you run this file, the output should match your verification.
    }
}