public class Student25 { // Replace 22 with your actual attendance number
    String nim;
    String name;
    String className;
    int grade;

    // Parameterized Constructor
    public Student25(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1; 
    }


    void grading(int grade) {
        this.grade = grade;
    }
}