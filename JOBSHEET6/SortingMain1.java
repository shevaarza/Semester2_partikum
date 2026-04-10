public class SortingMain1 {
    public static void main(String[] args) {
      
        int[] b = {30, 20, 2, 8, 14};

        // Step 3: Instantiate the object
        Sorting1 sorting2 = new Sorting1(b);

      
        System.out.println("Original array:");
        sorting2.print();

        sorting2.selectionSort();

        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();
    }
}