import java.util.ArrayList;

public class QueueList {
    BuyerNode head;
    BuyerNode tail;
    int size = 0;

    // Menyimpan nomor antrean yang dibatalkan
    ArrayList<Integer> canceledQueues = new ArrayList<>();

    public void addQueue(Buyer buyer) {
        BuyerNode newNode = new BuyerNode(buyer);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;

        System.out.println("Queue successfully added with number: "
                + buyer.queueNumber);
    }

    public Buyer removeQueue() {
        if (head == null) {
            return null;
        }

        Buyer servedBuyer = head.data;

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;

        return servedBuyer;
    }

    // =========================
    // CANCEL QUEUE FEATURE
    // =========================
    public void cancelQueue(int queueNumber) {

        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        BuyerNode current = head;

        while (current != null) {

            if (current.data.queueNumber == queueNumber) {

                canceledQueues.add(queueNumber);

                if (current == head) {
                    head = head.next;

                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;

                System.out.println("Queue number "
                        + queueNumber
                        + " successfully canceled.");

                return;
            }

            current = current.next;
        }

        System.out.println("Queue number not found.");
    }

    public void showCanceledQueues() {

        if (canceledQueues.isEmpty()) {
            System.out.println("No canceled queues.");
            return;
        }

        System.out.println("\n===== CANCELED QUEUES =====");

        for (int queue : canceledQueues) {
            System.out.println("Queue Number : " + queue);
        }
    }

    public void printQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        BuyerNode current = head;

        System.out.println("\n===== QUEUE LIST =====");

        while (current != null) {
            System.out.println("Queue Number : "
                    + current.data.queueNumber);

            System.out.println("Buyer Name   : "
                    + current.data.name);

            System.out.println("Phone Number : "
                    + current.data.phoneNumber);

            System.out.println("--------------------------------");

            current = current.next;
        }

        System.out.println("Total Queue : " + size);
    }

    
}