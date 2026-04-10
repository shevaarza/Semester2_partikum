public class Student{
    int nim , age ;
    String name;
    double gpa;

    public Student(int nim , int age , String name , double gpa){
        this.name = name;
        this.age = age;
        this.nim = nim ;
        this.gpa = gpa;
    }

    public void display(){
        System.out.println("NIM :" + nim);
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("GPA :" + gpa);
    }
}