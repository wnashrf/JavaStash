public class Main {
    public static void main(String[] args) {

        String tutorName = " ", tutorIC = " ", tutorAdd = " ", tutorQualification = " ", yearExp = " ", dateJoined = " ", yearsInCentre = " ";

        StudentBiography student1 = new StudentBiography();
        student1.setName("Wan Muhammad Ashraf");

        StudentBiography student2 = new StudentBiography();
        student2.setName("Von Astrea Bernoulli");

        StudentBiography student3 = new StudentBiography();
        student3.setName("Putu a/l Rajapayar");

        StudentBatch studBatch2023 = new StudentBatch();
        studBatch2023.AddStudent(student1);
        studBatch2023.AddStudent(student2);
        studBatch2023.AddStudent(student3);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());


        Boolean isIn = studBatch2023.find("Wan");
        System.out.println("IS Student is in batch03: " + isIn);


        try {
            for (int i=0; i<3; i++){
                student1.setMark(80,i);
                student2.setMark(55,i);
                student3.setMark(68,i);
            }
        }catch (Exception ex){
            System.out.println("Error");
            ex.printStackTrace();
        }
        student1.displayMark();
        student2.displayMark();
        student3.displayMark();

        float avg1 = student1.calcAvg();
        float avg2 = student2.calcAvg();
        float avg3 = student3.calcAvg();

        System.out.print("Students average mark: " + avg1 + " " + avg2 + " " + avg3 + "\n" + "\n");

        Tutor firstTutor = new Tutor(tutorName, tutorIC, tutorAdd, tutorQualification, yearExp, dateJoined, yearsInCentre);
        System.out.println(firstTutor.toString_tutor());


    }
}