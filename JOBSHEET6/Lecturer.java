public class Lecturer {
    String id;
    String name;
    boolean gender; // true for Male, false for Female
    int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.printf("| %-10s | %-20s | %-10s | %-5d |\n", id, name, genderStr, age);
    }
}