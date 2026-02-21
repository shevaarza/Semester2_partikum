public class DosenMain {

    public static void main(String[] args) {

        
        Lecturers lecturer1 = new Lecturers();
        lecturer1.idLecturer = "L001";
        lecturer1.Name = "Dr. Aris";
        lecturer1.ActiveStatus = true;
        lecturer1.yearOfEntry = 2015;
        lecturer1.ExpertiseCompetency = "Artificial Intelligence";

      
        Lecturers lecturer2 = new Lecturers(
                "L002",
                "Sarah M.Sc",
                false,
                2020,
                "Cyber Security"
        );

        System.out.println("--- Lecturer 1 Info ---");
        lecturer1.showInformation();
        System.out.println("Years worked: " + lecturer1.calculateTimeWork(2026));

        System.out.println("\n--- Updating Lecturer 1 ---");
        lecturer1.changeSkill("Machine Learning");
        lecturer1.setStatusActive(false);
        lecturer1.showInformation();

        System.out.println("\n-------------------------");

        System.out.println("--- Lecturer 2 Info ---");
        lecturer2.showInformation();
        System.out.println("Years worked: " + lecturer2.calculateTimeWork(2026));

        System.out.println("\n--- Updating Lecturer 2 ---");
        lecturer2.setStatusActive(true);
        lecturer2.showInformation();
    }
}