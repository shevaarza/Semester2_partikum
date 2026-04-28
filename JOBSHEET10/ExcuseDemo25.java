import java.util.Scanner;

public class ExcuseDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        int cap = sc.nextInt();
        sc.nextLine();

        ExcuseLetterStack25 stack = new ExcuseLetterStack25(cap);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Select (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID Letter     : "); String id = sc.nextLine();
                    System.out.print("Student Name  : "); String name = sc.nextLine();
                    System.out.print("Class         : "); String cls = sc.nextLine();
                    System.out.print("Type (S/I)    : "); char type = sc.next().charAt(0);
                    System.out.print("Duration(days): "); int dur = sc.nextInt();
                    stack.push(new ExcuseLetter25(id, name, cls, type, dur));
                    break;
                case 2:
                    ExcuseLetter25 p = stack.pop();
                    if (p != null) System.out.println("Processed letter from: " + p.name);
                    else System.out.println("No letters to process.");
                    break;
                case 3:
                    ExcuseLetter25 l = stack.peek();
                    if (l != null) System.out.println("Latest submission: " + l.name + " (" + l.id + ")");
                    else System.out.println("Stack is empty.");
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    String sName = sc.nextLine();
                    stack.searchByName(sName);
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}