package JOBSHEET3;

public class DataDosen {

    void dataAllDosen(Dosen[] arrayOfDosen) {

        System.out.println("\n=== DATA DOSEN ===");

        for (Dosen d : arrayOfDosen) {
            System.out.println("Code   : " + d.code);
            System.out.println("Name   : " + d.name);
            System.out.println("Gender : " + (d.gender ? "Male" : "Female"));
            System.out.println("Age    : " + d.age);
            System.out.println("------------------------");
        }
    }

    void numberOfLecturersPerGender(Dosen[] arrayOfDosen) {

        int male = 0;
        int female = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Number of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    void AverageAgeOfLecturersPerGender(Dosen[] arrayOfDosen) {

        int totalMale = 0, totalFemale = 0;
        int countMale = 0, countFemale = 0;

        for (Dosen d : arrayOfDosen) {

            if (d.gender) {
                totalMale += d.age;
                countMale++;
            } else {
                totalFemale += d.age;
                countFemale++;
            }
        }

        if (countMale > 0)
            System.out.println("Average Age Male Lecturers   : " + (totalMale / countMale));

        if (countFemale > 0)
            System.out.println("Average Age Female Lecturers : " + (totalFemale / countFemale));
    }

    void infoDosenPalingTua(Dosen[] arrayOfDosen) {

        Dosen oldest = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.age > oldest.age) {
                oldest = d;
            }
        }

        System.out.println("\nOldest Lecturer");
        System.out.println("Name : " + oldest.name);
        System.out.println("Age  : " + oldest.age);
    }

    void infoDosenMostYoungest(Dosen[] arrayOfDosen) {

        Dosen youngest = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.age < youngest.age) {
                youngest = d;
            }
        }

        System.out.println("\nYoungest Lecturer");
        System.out.println("Name : " + youngest.name);
        System.out.println("Age  : " + youngest.age);
    }

}