public class StudentAssignmentStack25 { 
    Student25[] stack;
    int top;
    int size;


    public StudentAssignmentStack25(int size) {
        this.size = size;
        this.stack = new Student25[size];
        this.top = -1; 
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }


    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

   
    void push(Student25 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }


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


    Student25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }


    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t"
                    + stack[i].className);
        }
        System.out.println("");
    }

    String convertToBinary(int grade) {
    ConversionStack25 stack = new ConversionStack25();
    
    // Proses membagi angka menjadi biner
    while (grade > 0) {
        int mod = grade % 2;
        stack.push(mod);
        grade = grade / 2;
    }
    
  
    String binary = "";
    while (!stack.isEmpty()) {
        binary += stack.pop();
    }
    
    return binary;
}
}