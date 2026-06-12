import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(10);

        int choice;

        do {
            System.out.println("\n=== Student Service Queue ===");
            System.out.println("1. Add student to queue");
            System.out.println("2. Call next student");
            System.out.println("3. Display front and rear student");
            System.out.println("4. Display total students in queue");
            System.out.println("5. Display all students");
            System.out.println("6. Check if queue is empty");
            System.out.println("7. Check if queue is full");
            System.out.println("8. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Input NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Input Name  : ");
                    String name = sc.nextLine();

                    System.out.print("Input Class : ");
                    String className = sc.nextLine();

                    Student std = new Student(nim, name, className);
                    queue.enqueue(std);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printFrontRear();
                    break;

                case 4:
                    queue.printTotal();
                    break;

                case 5:
                    queue.printAll();
                    break;

                case 6:
                    System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
                    break;

                case 7:
                    System.out.println(queue.isFull() ? "Queue is full." : "Queue is not full.");
                    break;

                case 8:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }

        } while (choice != 0);

        sc.close();
    }
}