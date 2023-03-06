import java.util.ArrayList;

public class TuitionCenter {
    private String centerName;
    private String phyAddress;
    private String headmaster;
    private ArrayList<Tutor> tutors;

    public TuitionCenter (String centerName, String physicalAddress, String headMaster){
        this.centerName = centerName;
        this.phyAddress = physicalAddress;
        this.headmaster = headMaster;
        this.tutors = new ArrayList<Tutor>();
    }

    //Get and Set Method
    public String getCenterName(){
        return centerName;
    }
    public void setCenterName(String centerName){
        this.centerName = centerName;
    }

    public String getPhyAddress(){
        return phyAddress;
    }
    public void setPhysicalAddress(){
        this.phyAddress = phyAddress;
    }

    public String getHeadmaster(){
        return headmaster;
    }
    public void setHeadMaster(){
        this.headmaster = headmaster;
    }

    public void addTutor(Tutor tutor){
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor){
        tutors.remove(tutor);
    }

    public ArrayList<Tutor> getTutors(){
        return tutors;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tuition Center Name: ").append(centerName).append("\n");
        builder.append("Address: ").append(phyAddress).append("\n");
        builder.append("Head Master: ").append(headmaster).append("\n");
        builder.append("Tutors: \n");
        for(Tutor tutor: tutors){
            builder.append(tutor.toString_tutor()).append("\n");
        }
        return builder.toString();
    }
}