import java.util.Scanner;

public class KRSQueueMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);

        int choice;

        do {
            System.out.println("\n=== KRS Approval Queue Menu ===");
            System.out.println("1. Add Student to Queue");
            System.out.println("2. Process KRS Approval");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Show Total Students in Queue");
            System.out.println("7. Show Approved Students Count");
            System.out.println("8. Show Students Not Yet Approved");
            System.out.println("9. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM           : ");
                    String nim = sc.nextLine();

                    System.out.print("Name          : ");
                    String name = sc.nextLine();

                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();

                    System.out.print("Class         : ");
                    String className = sc.nextLine();

                    Student student = new Student(nim, name, studyProgram, className);
                    queue.enqueue(student);
                    break;

                case 2:
                    queue.processApproval();
                    break;

                case 3:
                    queue.printAll();
                    break;

                case 4:
                    queue.printFirstTwo();
                    break;

                case 5:
                    queue.printRear();
                    break;

                case 6:
                    queue.printQueueSize();
                    break;

                case 7:
                    queue.printApprovedCount();
                    break;

                case 8:
                    queue.printNotApprovedCount();
                    break;

                case 9:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid menu!!!");
            }

        } while (choice != 0);
    }
}