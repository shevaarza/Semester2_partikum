import java.util.Scanner;

public class Main_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input maximum number of data: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int choice;

        do {
            Queue.menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Input new data: ");
                    int newData = sc.nextInt();
                    Q.enqueue(newData);
                    break;

                case 2:
                    int outData = Q.dequeue();
                    if (outData != -1) {
                        System.out.println("Removed data: " + outData);
                    }
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}