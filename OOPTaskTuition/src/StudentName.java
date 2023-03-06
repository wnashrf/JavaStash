public class StudentName {

    //atributes
    private String fName;
    private String mName;
    private String lName;


    public void setfName(String fName){
        this.fName = fName;
    }

    public void setmName(String mName){
        this.mName = mName;
    }

    public void setlName(String lName){
        this.lName = lName;
    }

    public String toString(){
        return fName + " " + mName + " " + lName;
    }




}