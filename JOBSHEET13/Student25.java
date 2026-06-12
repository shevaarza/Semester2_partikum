public class Student25 {

    String nim ;
    String name;
    String ClassName;
    double GPA ;

    public Student25(){

    }

    public Student25(String nim , String nama , String ClassName , double ipk){
        this.nim = nim;
        this.name = nama;
        this.ClassName = ClassName;
        this.GPA = ipk;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + ClassName + " - " + GPA + " - ");;
    }
}
