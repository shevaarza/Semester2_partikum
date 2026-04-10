public class Student {
    String id, name, studyProgram;

    public Student(String id, String name, String studyProgram) {
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void display() {
        System.out.println("NIM   : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Study Program : " + studyProgram);
    }
}