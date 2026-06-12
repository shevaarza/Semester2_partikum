public class Student {
    String nim, name, className;

    public Student(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className);
    }
}