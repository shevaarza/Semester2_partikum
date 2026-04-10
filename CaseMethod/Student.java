class Student {
    String id;
    String name;
    String studyProgram;

    Student(String id, String name, String studyProgram) {
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    void showStudent() {
        System.out.println(id + " | " + name + " | " + studyProgram);
    }
}