class Loan {
    Student std;
    Book book;
    int loanDuration;
    int loanLimit = 5;
    int late, fine;

    Loan(Student std, Book book, int loanDuration){
        this.std = std;
        this.book = book;
        this.loanDuration = loanDuration;
        calculateFine();
    }

    void calculateFine(){
        if(loanDuration > loanLimit){
            late = loanDuration - loanLimit;
            fine = late * 2000;
        } else {
            late = 0;
            fine = 0;
        }
    }

    void showLoan(){
        System.out.println(std.id + " | " + std.name + " | " +
                book.title + " | " + loanDuration +
                " days | Late: " + late + " | Fine: Rp " + fine);
    }
}