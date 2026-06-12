public class OrderList {
    OrderNode head;
    OrderNode tail;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByOrderName() {
        if (head == null) {
            return;
        }

        OrderNode current = head;

        while (current != null) {

            OrderNode index = current.next;

            while (index != null) {

                if (current.data.orderName.compareToIgnoreCase(
                        index.data.orderName) > 0) {

                    Order temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }

            current = current.next;
        }
    }

    public void printOrderReport() {
        if (head == null) {
            System.out.println("No order data.");
            return;
        }

        sortByOrderName();

        int totalRevenue = 0;

        OrderNode current = head;

        System.out.println("\n====================================");
        System.out.println("ORDER REPORT");
        System.out.println("====================================");

        System.out.println(ANSI_RED);
        System.out.printf("%-10s %-20s %-10s\n",
                "Code",
                "Order Name",
                "Price");

        while (current != null) {

            System.out.printf("%-10d %-20s %-10d\n",
                    current.data.orderCode,
                    current.data.orderName,
                    current.data.price);

            totalRevenue += current.data.price;

            current = current.next;
        }

        System.out.println("------------------------------------");
        System.out.println("Total Revenue : Rp " + totalRevenue);
        System.out.println(ANSI_RESET);
    }

    
}