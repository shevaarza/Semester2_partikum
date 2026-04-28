import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // INPUT STUDENTS , 1. Modify the list data to accept user input.
System.out.print("Input number of students: ");
int nStudent = sc.nextInt();
sc.nextLine();

Student[] students = new Student[nStudent];

for(int i = 0; i < nStudent; i++){
    System.out.println("\nStudent " + (i+1));

   
    String id;
    while(true){
        System.out.print("ID (numbers only): ");
        id = sc.nextLine();

        if(id.matches("\\d+")){ 
            break;
        } else {
            System.out.println("Invalid! ID must be numbers only. Try again.");
        }
    }

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Study Program: ");
    String sp = sc.nextLine();

    students[i] = new Student(id, name, sp);
}

// INPUT BOOKS
System.out.print("\nInput amount of books: ");
int nBook = sc.nextInt();
sc.nextLine();

Book[] books = new Book[nBook];

for(int i = 0; i < nBook; i++){
    System.out.println("\nBook " + (i+1));

  
    String code;
    while(true){
        System.out.print("Code (numbers only): ");
        code = sc.nextLine();

        if(code.matches("\\d+")){ 
            break;
        } else {
            System.out.println("Invalid! Code must be numbers only. Try again.");
        }
    }

    System.out.print("Title: ");
    String title = sc.nextLine();

    System.out.print("Year: ");
    int year = sc.nextInt();
    sc.nextLine();

    books[i] = new Book(code, title, year);
}

// INPUT LOANS
System.out.print("\nInput amount student of loans: ");
int nLoan = sc.nextInt();

Loan[] loans = new Loan[nLoan];

for(int i = 0; i < nLoan; i++){
    System.out.println("\n==============================");
    System.out.println("Loan " + (i+1));
    System.out.println("==============================");


    System.out.println("\nAvailable Students:");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("| %-5s | %-10s | %-20s | %-15s |\n", "Idx", "ID", "Name", "Study Program");
    System.out.println("---------------------------------------------------------------");
    for(int j = 0; j < students.length; j++){
        System.out.printf("| %-5d | %-10s | %-20s | %-15s |\n",
                j, students[j].id, students[j].name, students[j].studyProgram);
    }
    System.out.println("---------------------------------------------------------------");

    System.out.print("Choose student index: ");
    int sIndex = sc.nextInt();

    System.out.println("\nAvailable Books:");
    System.out.println("-----------------------------------------------------------");
    System.out.printf("| %-5s | %-10s | %-25s | %-6s |\n", "Idx", "Code", "Title", "Year");
    System.out.println("-----------------------------------------------------------");
    for(int j = 0; j < books.length; j++){
        System.out.printf("| %-5d | %-10s | %-25s | %-6d |\n",
                j, books[j].code, books[j].title, books[j].year);
    }
    System.out.println("-----------------------------------------------------------");

    System.out.print("Choose book index: ");
    int bIndex = sc.nextInt();

    System.out.print("Loan duration (days): ");
    int duration = sc.nextInt();

    loans[i] = new Loan(students[sIndex], books[bIndex], duration);
}
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Book");
            System.out.println("3. Show Loan");
            System.out.println("4. Sort by Fine (Insertion)");
            System.out.println("5. Search by Student ID (Binary)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("\n--- Students ---");
                    for(Student student: students) student.showStudent();
                    break;
                    

                case 2:
                    System.out.println("\n--- Books ---");
                    for(Book book: books) book.showBook();
                    break;
                case 3:
                    System.out.println("\nFine already calculated automatically!");
                    for(Loan loan: loans) loan.showLoan();
                    break;
                // 2. Modify the sort menu by adding an option to select a different sorting algorithm (hard).
                case 4:
                        System.out.println("\nChoose Sorting Method:");
                        System.out.println("1. Insertion Sort (by Fine)");
                        System.out.println("2. Selection Sort (by Fine)");
                        System.out.print("Choose: ");
                        int sortChoice = sc.nextInt();

                        if(sortChoice == 1){
                            insertionSort(loans);
                            System.out.println("\nSorted using Insertion Sort!");
                        } else if(sortChoice == 2){
                            selectionSort(loans);
                            System.out.println("\nSorted using Selection Sort!");
                        }

                        for(Loan loan: loans) loan.showLoan();
                        break;
                        // 3. Modify the search menu by adding a different search algorithm (hard).
               case 5:
                        System.out.println("\nChoose Search Method:");
                        System.out.println("1. Binary Search");
                        System.out.println("2. Sequential Search");
                        System.out.print("Choose: ");
                        int searchChoice = sc.nextInt();

                        System.out.print("Input ID: ");
                        String id = sc.next();

                        if(searchChoice == 1){
                            sortByID(loans); // wajib sebelum binary
                            binarySearch(loans, id);
                        } else if(searchChoice == 2){
                            sequentialSearch(loans, id);
                        }

                        break;
            }

        } while(choice != 0);
    }

  
    static void insertionSort(Loan[] loans){
    for(int i=1;i<loans.length;i++){
        Loan key = loans[i];
        int j = i-1;

        while(j>=0 && loans[j].fine < key.fine){
            loans[j+1] = loans[j];
            j--;
        }
        loans[j+1] = key;
    }
}
    // 2. Modify the sort menu by adding an option to select a different sorting algorithm (hard).
    static void selectionSort(Loan[] loans){
    for(int i = 0; i < loans.length - 1; i++){
        int maxIndex = i;

        for(int j = i + 1; j < loans.length; j++){
            if(loans[j].fine > loans[maxIndex].fine){
                maxIndex = j;
            }
        }

        Loan temp = loans[i];
        loans[i] = loans[maxIndex];
        loans[maxIndex] = temp;
    }
}
// 3. Modify the search menu by adding a different search algorithm (hard).
        static void sequentialSearch(Loan[] loans, String id){
    boolean found = false;

    for(int i = 0; i < loans.length; i++){
        if(loans[i].std.id.equals(id)){
            loans[i].showLoan();
            found = true;
        }
    }

    if(!found){
        System.out.println("Data not found!");
    }
}


    static void sortByID(Loan[] loans){
        for(int i=1;i<loans.length;i++){
            Loan key = loans[i];
            int j=i-1;

            while(j>=0 && loans[j].std.id.compareTo(key.std.id)>0){
                loans[j+1]=loans[j];
                j--;
            }
            loans[j+1]=key;
        }
    }

    static void binarySearch(Loan[] loans, String id){
        int left=0, right=loans.length-1;
        boolean found=false;

        while(left<=right){
            int mid=(left+right)/2;

            if(loans[mid].std.id.equals(id)){
                loans[mid].showLoan();
                found=true;
                break;
            }
            else if(loans[mid].std.id.compareTo(id)<0){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        if(!found){
            System.out.println("Data not found!");
        }
    }
}