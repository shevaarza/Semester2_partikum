public class Student {
    String nim;
    String name;
    String studyProgram;
    String className;

    // Constructor
    public Student(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    // Method print
    void print() {
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + className);
    }
}