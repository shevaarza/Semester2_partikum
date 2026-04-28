public class ExcuseLetterStack25 {
    ExcuseLetter25[] letters;
    int size;
    int top;

    public ExcuseLetterStack25(int size) {
        this.size = size;
        this.letters = new ExcuseLetter25[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    // Menu 1: Submit Excuse Letter
    public void push(ExcuseLetter25 letter) {
        if (!isFull()) {
            letters[++top] = letter;
            System.out.println("Letter submitted for student: " + letter.name);
        } else {
            System.out.println("Stack is full! Cannot submit more letters.");
        }
    }

    // Menu 2: Process Excuse Letter
    public ExcuseLetter25 pop() {
        if (!isEmpty()) {
            return letters[top--];
        }
        return null;
    }

    // Menu 3: View Latest Excuse Letter
    public ExcuseLetter25 peek() {
        if (!isEmpty()) {
            return letters[top];
        }
        return null;
    }

    // Menu 4: Search for Letter by student's name
    public void searchByName(String searchName) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (letters[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("--- Letter Found ---");
                System.out.println("ID        : " + letters[i].id);
                System.out.println("Name      : " + letters[i].name);
                System.out.println("Class     : " + letters[i].className);
                System.out.println("Type      : " + (letters[i].typeOfExcuse == 'S' ? "Sick" : "Personal"));
                System.out.println("Duration  : " + letters[i].duration + " days");
                found = true;
                break; // Hentikan jika hanya ingin mencari yang terbaru
            }
        }
        if (!found) System.out.println("No letter found for student: " + searchName);
    }
}