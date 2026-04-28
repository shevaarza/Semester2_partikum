public class StudentAssignmentStack25 { // Replace 22 with your actual attendance number
    Student25[] stack;
    int top;
    int size;

    // Parameterized Constructor
    public StudentAssignmentStack25(int size) {
        this.size = size;
        this.stack = new Student25[size];
        this.top = -1; 
    }

    // 8. Method to check if the stack is full
    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // 9. Method to check if the stack is empty
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // 10. Method to push (add) a Student object onto the stack
    void push(Student25 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    // 11. Metode pop untuk mengambil dan menghapus data dari puncak stack
    Student25 pop() {
        if (!isEmpty()) {
            Student25 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // 12. Metode peek untuk melihat data di puncak stack tanpa menghapusnya
    Student25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // 13. Metode print untuk menampilkan seluruh isi stack
    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t"
                    + stack[i].className);
        }
        System.out.println("");
    }
}