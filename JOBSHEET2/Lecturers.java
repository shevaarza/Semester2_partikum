public class Lecturers {
   
    String idLecturer;
    String Name;
    boolean ActiveStatus;
    int yearOfEntry;
    String ExpertiseCompetency;

  
    public Lecturers() {
    }

   
    public Lecturers(String id, String name, boolean status, int year, String expertise) {
        this.idLecturer = id;
        this.Name = name;
        this.ActiveStatus = status;
        this.yearOfEntry = year;
        this.ExpertiseCompetency = expertise;
    }

   
    public void showInformation() {
        System.out.println("ID Lecturer: " + idLecturer);
        System.out.println("Name: " + Name);
        System.out.println("Status: " + (ActiveStatus ? "Active" : "Inactive"));
        System.out.println("Year of Entry: " + yearOfEntry);
        System.out.println("Expertise: " + ExpertiseCompetency);
    }

  
    public void setStatusActive(boolean status) {
        this.ActiveStatus = status;
        System.out.println("Status updated for " + Name);
    }

   
    public int calculateTimeWork(int YearNow) {
        return YearNow - yearOfEntry;
    }

    
    public void changeSkill(String Skill) {
        this.ExpertiseCompetency = Skill;
        System.out.println("Expertise updated for " + Name);
    }
}