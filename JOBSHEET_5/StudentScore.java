package JOBSHEET_5;

public class StudentScore {
   Student[] students;

    public StudentScore(Student[] students){
        this.students = students;
    }

    // Divide and Conquer - mencari UTS tertinggi
    public int maxUTS(int l, int r){
        if(l == r){
            return students[l].uts;
        }

        int mid = (l + r) / 2;

        int leftMax = maxUTS(l, mid);
        int rightMax = maxUTS(mid+1, r);

        return Math.max(leftMax, rightMax);
    }

    // Divide and Conquer - mencari UTS terendah
    public int minUTS(int l, int r){
        if(l == r){
            return students[l].uts;
        }

        int mid = (l + r) / 2;

        int leftMin = minUTS(l, mid);
        int rightMin = minUTS(mid+1, r);

        return Math.min(leftMin, rightMin);
    }

    // Brute Force - rata rata UAS
    public double averageUAS(){
        int total = 0;

        for(Student s : students){
            total += s.uas;
        }

        return (double) total / students.length;
    }
}
