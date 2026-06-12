import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static int inputInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();
                scanner.nextLine();

                return number;

            } else {

                System.out.println("Input must be a number!");
                scanner.nextLine();
            }
        }
    }

    public static String inputString(String message) {

        while (true) {

            System.out.print(message);

            String text = scanner.nextLine();

            if (!text.trim().isEmpty()) {
                return text;
            }

            System.out.println("Input cannot be empty!");
        }
    }

    public static void main(String[] args) {

        QueueList queueList = new QueueList();
        OrderList orderList = new OrderList();

        int queueNumber = 1;
        int orderCode = 100;

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("ROYAL DELISH QUEUE SYSTEM");
            System.out.println("================================");

            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Order");
            System.out.println("4. Order Report");
            System.out.println("5. Cancel Queue");
            System.out.println("6. Show Canceled Queue");
            System.out.println("0. Exit");
            choice = inputInt("Choose menu : ");

            switch (choice) {

                case 1:

                    String name =
                            inputString("Input Name : ");

                    String phone =
                            inputString("Phone Number : ");

                    Buyer buyer = new Buyer(queueNumber, name, phone);

                    queueList.addQueue(buyer);

                    queueNumber++;

                    break;

                case 2:

                    queueList.printQueue();

                    break;

                case 3:

                    Buyer servedBuyer =
                            queueList.removeQueue();

                    if (servedBuyer == null) {

                        System.out.println("Queue is empty.");

                    } else {
                      
                        System.out.println("\nServed Buyer");

                        System.out.println("Queue Number : "
                                + servedBuyer.queueNumber);

                        System.out.println("Buyer Name   : "
                                + servedBuyer.name);

                        System.out.println("Phone Number : "
                                + servedBuyer.phoneNumber);
                    
                        System.out.println("----------------------------------------");
                          System.out.println(ANSI_RED);
                        String orderName =
                                inputString("Order Name : ");

                        int price =
                                inputInt("Price : ");

                        Order order =
                                new Order(orderCode,
                                        orderName,
                                        price);
                        System.out.println( ANSI_RESET);                                    
                        orderList.addOrder(order);
                        
                        System.out.println("----------------------------------------");

                        System.out.println(
                                "Order successfully added.");

                        orderCode++;
                    }

                    break;

                case 4:
                    System.out.println("\nGenerating order report...");
                    orderList.printOrderReport();
            
                    break;
                case 5:

                        int cancelNumber =
                        inputInt("Input Queue Number to Cancel : ");
                        queueList.cancelQueue(cancelNumber);
                        break;

                     case 6:

                        queueList.showCanceledQueues();

                         break;
                case 0:

                    System.out.println("Program finished.");

                    break;

                default:

                    System.out.println("Menu not available.");
            }

        } while (choice != 0);
    }
}


// huruf


