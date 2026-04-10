public class SearchStudent {
    
    Student[]liststd = new Student[5];
    int idx;

    public void add (Student std){
        if(idx < liststd.length){
            liststd[idx] = std;
            idx++;
        }else{
            System.out.println("data is already full");
        }
    }

    public void display(){
        for(Student student : liststd){
            student.display();
            System.out.println("-------------------------------------------");
        }
    }

  public int findSeqSearch(int search){
    int position = -1;
    for(int i = 0 ; i < idx; i++){   
        if(liststd[i].nim == search){
            position = i;
            break;
        }
    }
    return position;
}

    public void ShowPosistion(int x , int pos){

        if(pos != -1 ){
            System.out.println("Data :" + x + " is found in index -" + pos);

        }else {
            System.out.println("Data :" + x + " is not found ");
        }
    }

    public void showData(int x , int pos){
        if(pos  != -1){
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + liststd[pos].name);
            System.out.println("Age \t :" + liststd[pos].age );
            System.out.println("GPA \t :" + liststd[pos].gpa);
        }else{
            System.out.println("Data :" + x + "is not found");
        }
    }
}
