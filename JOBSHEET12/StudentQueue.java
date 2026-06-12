public class StudentQueue {
    node front, rear;
    int size;
    int max;

    public StudentQueue(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        node newNode = new node(std);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Student added to queue.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Calling student:");
            front.data.print();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("First student in queue:");
            front.data.print();

            System.out.println("Last student in queue:");
            rear.data.print();
        }
    }

    void printTotal() {
        System.out.println("Total students in queue: " + size);
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            node temp = front;
            System.out.println("Students in queue:");
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }
}