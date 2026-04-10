import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        SearchStudent data = new SearchStudent(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent data " + (i + 1));

            System.out.print("NIM: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Study Program: ");
            String prodi = sc.nextLine();

            data.add(new Student(id, name, prodi));
        }

        System.out.println("\nAll Data:");
        data.display();

        System.out.print("\nSearch NIM: ");
        String search = sc.nextLine();

        // SEQUENTIAL
        System.out.println("\nSequential Search:");
        int pos = data.findSeqSearch(search);
        data.showPosition(search, pos);
        data.showData(pos);

        // BINARY
        System.out.println("\nBinary Search:");
        data.sortByNIM();
        int posB = data.FindBinarySearch(search, 0, n - 1);
        data.showPosition(search, posB);
        data.showData(posB);
    }
}