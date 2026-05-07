public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int approvedCount;
    final int MAX_DPA_STUDENTS = 30;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        front = 0;
        rear = -1;
        size = 0;
        approvedCount = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    void enqueue(Student student) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }

        if (approvedCount + size >= MAX_DPA_STUDENTS) {
            System.out.println("DPA student limit has been reached!!!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = student;
        size++;

        System.out.println(student.name + " has been added to the KRS approval queue.");
    }

    Student dequeueOne() {
        if (isEmpty()) {
            return null;
        }

        Student student = data[front];
        data[front] = null;
        front = (front + 1) % max;
        size--;
        approvedCount++;

        return student;
    }

    void processApproval() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!! No students to process.");
            return;
        }

        System.out.println("Students being processed for KRS approval:");

        for (int i = 1; i <= 2; i++) {
            Student student = dequeueOne();

            if (student != null) {
                System.out.print(i + ". ");
                student.print();
            }
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }

        System.out.println("All students in KRS approval queue:");

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print((count + 1) + ". ");
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void printFirstTwo() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }

        System.out.println("First students in line:");

        int i = front;
        int limit = Math.min(2, size);

        for (int count = 0; count < limit; count++) {
            System.out.print((count + 1) + ". ");
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void printRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
        } else {
            System.out.println("Last student in queue:");
            data[rear].print();
        }
    }

    void printQueueSize() {
        System.out.println("Total students in queue: " + size);
    }

    void printApprovedCount() {
        System.out.println("Students who have completed KRS approval: " + approvedCount);
    }

    void printNotApprovedCount() {
        int notApproved = MAX_DPA_STUDENTS - approvedCount;
        System.out.println("Students who have not completed KRS approval: " + notApproved);
    }
}