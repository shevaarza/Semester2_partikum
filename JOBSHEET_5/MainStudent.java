package JOBSHEET_5;

public class MainStudent {
 public static void main(String[] args) {

        Student[] list = {
            new Student("Ahmad","220101001",2022,78,82),
            new Student("Budi","220101002",2022,85,88),
            new Student("Cindy","220101003",2021,90,87),
            new Student("Dian","220101004",2021,76,79),
            new Student("Eko","220101005",2023,92,95),
            new Student("Fajar","220101006",2020,88,85),
            new Student("Gina","220101007",2023,80,83),
            new Student("Hadi","220101008",2020,82,84)
        };

        StudentScore data = new StudentScore(list);

        System.out.println("Highest UTS (Divide and Conquer) : "
                + data.maxUTS(0, list.length-1));

        System.out.println("Lowest UTS (Divide and Conquer) : "
                + data.minUTS(0, list.length-1));

        System.out.println("Average UAS (Brute Force) : "
                + data.averageUAS());
    }
}
