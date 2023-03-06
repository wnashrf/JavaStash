import java.util.Scanner;
public class Tutor {

    Scanner Input = new Scanner(System.in);
    private
    String name, IC, Address, Qualification, yearOfExp, dateJoined, yearInCentre;

    public String toString_tutor(){
        return getTutorName() + "\n" + getTutorIC() + "\n" + getTutorAddress() +"\n" + getTutorQualifi() + "\n" + getYearOfExp() + "\n" + getDateJoined() + "\n" + getYearsInCentre();
    }


    public Tutor(String tutorName, String tutorIC, String tutorAdd, String tutorQualification, String yearExp, String dateJoined, String yearInCentre){
        setTutoName(tutorName);
        setTutorIC(tutorIC);
        setTutorAddress(tutorAdd);
        setTutorQ(tutorQualification);
        setYearOfExp(yearExp);
        setDateJoined(dateJoined);
        setYearsInCentre(yearInCentre);
    }

    public void setTutoName(String tutorName){
        name = tutorName;
    }

    public void setTutorIC(String tutorIC){
        IC = tutorIC;
    }

    public void setTutorAddress(String tutoAdd){
        Address = tutoAdd;
    }

    public void setTutorQ(String tutorQualifi){
        Qualification = tutorQualifi;
    }

    public void setYearOfExp(String YearExp){
        yearOfExp = YearExp;
    }

    public void setDateJoined(String DateJoined){
        dateJoined = DateJoined;
    }

    public void setYearsInCentre(String YearsIn){
        yearInCentre = YearsIn;
    }

    //Get from user
    public String getTutorName(){
        System.out.print("Tutor Name: ");
        name = Input.nextLine();
        return name;
    }

    public String getTutorIC(){
        System.out.print("Tutor IC: ");
        IC = Input.nextLine();
        return IC;
    }

    public String getTutorAddress(){
        System.out.print("Tutor Address: ");
        Address = Input.nextLine();
        return Address;
    }

    public String getTutorQualifi(){
        System.out.print("Tutor Qualification: ");
        Qualification = Input.nextLine();
        return Qualification;
    }

    public String getYearOfExp(){
        System.out.print("Year Experience: ");
        yearOfExp = Input.nextLine();
        return yearOfExp;
    }

    String getDateJoined(){
        System.out.print("Date Join the Centre: ");
        dateJoined = Input.nextLine();
        return dateJoined;
    }

    String getYearsInCentre(){
        System.out.print("Years In Centre: ");
        yearInCentre = Input.nextLine();
        return yearInCentre;
    }

}