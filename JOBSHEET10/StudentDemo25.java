import java.util.Scanner;

public class StudentDemo25 { 
    public static void main(String[] args) {
        
        StudentAssignmentStack25 stack = new StudentAssignmentStack25(5);
        
     
        Scanner scan = new Scanner(System.in);
        int choice;

        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit the assigement");
            System.out.println("2. Grade Assigment");
            System.out.println("3. View Top Assingement ");
            System.out.println("4. View all Assingement");
            System.out.print("Pilih: ");
            choice = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer newline

            switch (choice) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM  : ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String kelas = scan.nextLine();

                    Student25 mhs = new Student25(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Assingment %s already submit \n", mhs.name);
                    break;

                case 2:
                    Student25 graded = stack.pop(); 
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);

                     
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student25 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("The Last Assigment submition by " + lihat.name);
                    }
                    break;

                case 4:
                    System.out.println("Menu all assingemnt :");
                    System.out.println("NIM\tNama\tKelas");
                    stack.print();
                    break;

                default:
                    System.out.println("not correct choiced.");
            }
        } while (choice >= 1 && choice <= 4);

        scan.close();
    }
}