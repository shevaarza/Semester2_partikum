import java.util.Scanner;

public class LectureMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LecturerData manager = new LecturerData();
        int choice;

        do {
            System.out.println("\n--- Lecturer Management System ---");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest - Bubble Sort)");
            System.out.println("4. Sort DSC (Oldest to Youngest - Selection Sort)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scan.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Gender (true for Male / false for Female): ");
                    boolean gender = scan.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = scan.nextInt();
                    
                    manager.add(new Lecturer(id, name, gender, age));
                    break;
                case 2:
                    manager.print();
                    break;
                case 3:
                    manager.sortingASC();
                    manager.print();
                    break;
                case 4:
                    manager.sortingDSC();
                    manager.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);
        
        scan.close();
    }
}