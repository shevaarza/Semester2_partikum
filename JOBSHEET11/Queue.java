public class Queue {
    int[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: " + data[front]);
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Number of elements: " + size);
        } else {
            System.out.println("Queue is empty!");
        }
    }

   void enqueue(int dt) {
    if (!isFull()) {

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = dt;
        size++;

        System.out.printf("%d is successfully added at index %d\n", dt, rear);

    } else {
        System.out.println("Queue Overflow! Program stopped.");
        System.exit(0);
    }
}

    int dequeue() {
    int dt;

    if (!isEmpty()) {

        dt = data[front];
        size--;

        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return dt;

    } else {
        System.out.println("Queue Underflow! Program stopped.");
        System.exit(0);
    }

    return -1;
}

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue has been cleared!");
    }

    static void menu() {
        System.out.println("\nAvailable menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("0. Exit");
        System.out.println("=======================");
        System.out.print("Choose menu: ");
    }
}