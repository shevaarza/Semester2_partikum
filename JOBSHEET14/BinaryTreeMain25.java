public class BinaryTreeMain25 {
    public static void main(String[] args) {

        BinaryTree25 bst = new BinaryTree25();

        bst.addRekursif(new Student25("244107020138", "Devin", "TI-1I", 3.57));
        bst.addRekursif(new Student25("244107020023", "Dewi", "TI-1I", 3.85));
        bst.addRekursif(new Student25("244107020225", "Wahyu", "TI-1I", 3.21));
        bst.addRekursif(new Student25("244107020076", "Angelina", "TI-1I", 3.54));
        bst.addRekursif(new Student25("244107020223", "Andhika", "TI-1I", 3.72));
        bst.addRekursif(new Student25("244107020226", "Bima", "TI-1I", 3.37));
        bst.addRekursif(new Student25("244107020181", "Eiyu", "TI-1I", 3.46));

        System.out.println("Student List (In-Order Traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nStudent with Minimum GPA:");
        Student25 min = bst.getMinIPK();
        if (min != null) {
            min.print();
        }

        System.out.println("\nStudent with Maximum GPA:");
        Student25 max = bst.getMaxIPK();
        if (max != null) {
            max.print();
        }

        System.out.println("\nStudents with GPA above 3.50:");
        bst.displayStudentsWithIPKAbove(3.50);
    }
}