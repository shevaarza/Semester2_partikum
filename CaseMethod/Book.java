public class Book {
    String code;
    String title;
    int year;

    Book(String code , String title , int year){
        this.code = code;
        this.title = title;
        this.year = year;

    }

      void showBook() {
        System.out.println(code + " | " + title + " | " + year);
    }
}
