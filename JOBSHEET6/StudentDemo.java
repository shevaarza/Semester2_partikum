import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students to input: ");
        int total = sc.nextInt();
        
        TopStudent topStudents = new TopStudent(total);

        // Dynamic input loop 
        for (int i = 0; i < total; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Input NIM: ");
            String nim = sc.next();
            System.out.print("Input Name: ");
            sc.nextLine(); // Clear buffer
            String name = sc.nextLine();
            System.out.print("Input Class: ");
            String studentClass = sc.next();
            System.out.print("Input GPA: ");
            double gpa = sc.nextDouble();
            
            topStudents.add(new Student(nim, name, studentClass, gpa));
        }

        System.out.println("\n--- Original Student List ---");
        topStudents.print();

        // Sort Descending 
        topStudents.insertionSortDescending();
        
        System.out.println("\n--- Sorted List (Insertion Sort Descending) ---");
        topStudents.print();
        
        sc.close();
    }
}