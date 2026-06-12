import java.util.Scanner;
public class DoubleLinkedListMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList ddl = new DoubleLinkedList();
        int choose ;
        do{
              System.out.println("================ Double Linked List =================");
        System.out.println("1. add name frist node ");
        System.out.println("2. add name Last node ");
        System.out.println("3. add name inserAfter  ");
        System.out.println("4. Remove name in first ");
        System.out.println("5. Remove name in last  ");

     
        System.out.print("choose the option :");
        choose = scanner.nextInt();
        scanner.nextLine();

        switch (choose) {
            case 1: 
            System.out.print("Input nim :");
            String nim1 = scanner.nextLine();

            System.out.print("Input Nama :");
            String nama1 = scanner.nextLine();

            System.out.print("Input Class :");
            String className = scanner.nextLine();
            
            System.out.print("Input GPA :");
            double GPA = scanner.nextDouble();
            scanner.nextLine();

       
            Student25 s2 = new Student25(nim1, nama1, className, GPA);
            ddl.addFrist(s2);
            break;
            case 2 :
              System.out.print("Input NIM : ");
                String nim3 = scanner.nextLine();

                System.out.print("Input Name : ");
                String nama3 = scanner.nextLine();

                System.out.print("Input Class : ");
                String class3 = scanner.nextLine();

                System.out.print("Input GPA : ");
                double gpa3 = scanner.nextDouble();
                scanner.nextLine();

                Student25 s3 = new Student25(nim3, nama3, class3, gpa3);
                  ddl.addLast(s3);

                    break;
                case 3:
                    ddl.print();
            default:
                System.out.println("the option not found");
                break;
        } 
        }while(choose != 0 );
      

     
    }
}
