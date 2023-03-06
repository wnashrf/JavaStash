public class StudentBatch {

    //Student Batch is a list of students
    StudentBiography students[] = new StudentBiography[10];
    int currsize = 0;


    void AddStudent (StudentBiography s){
        students[currsize++] = s;
    }


    //find a particular students
    Boolean find(String name){
        for(int i = 0; i< currsize; i++){
            if (students[i].name == name);
            return true;
        }
        return false;
    }
}