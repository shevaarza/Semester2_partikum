import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DATA
        Student[] students = {
            new Student("22001","Abdul","Informatics Engineering"),
            new Student("22002","Bestari","Informatics Engineering"),
            new Student("22003","Gandi","Business Information System")
        };

        Book[] books = {
            new Book("B001","Algorithm",2020),
            new Book("B002","Database",2019),
            new Book("B003","Programming",2021),
            new Book("B004","Physics",2024)
        };

        Loan[] loans = {
            new Loan(students[0],books[0],7),
            new Loan(students[1],books[1],3),
            new Loan(students[2],books[2],10),
            new Loan(students[2],books[3],6),
            new Loan(students[0],books[1],4)
        };

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

                case 4:
                    insertionSort(loans);
                    System.out.println("\nSorted by highest fine!");
                    for(Loan loan: loans) loan.showLoan();
                    break;

                case 5:
                    sortByID(loans);
                    System.out.print("Input ID: ");
                    String id = sc.next();
                    binarySearch(loans, id);
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