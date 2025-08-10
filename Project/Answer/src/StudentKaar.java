
import java.util.*;

public class StudentKaar extends Student {

    private ArrayList<DarsKaar> studentPassedDars = new ArrayList<>();
    private ArrayList<DarsKaar> studentNowDars = new ArrayList<>();
    private int studentAv;

    //constructor
    public StudentKaar(String studentName, String studentLastName, int studentID, String studentCodeMelli, Reshte studentReshte, int studentTerm, int studentAv, ArrayList<DarsKaar> studentPassedDars) {
        super(studentName, studentLastName, studentID, studentCodeMelli, studentReshte, studentTerm);
        this.studentAv = this.studentAv;
        this.studentPassedDars = studentPassedDars;
    }

    //getter and setter
    public ArrayList<DarsKaar> getStudentPassedDars() {
        return studentPassedDars;
    }

    public void setStudentPassedDars(ArrayList<DarsKaar> studentPassedDars) {
        this.studentPassedDars = studentPassedDars;
    }

    public ArrayList<DarsKaar> getStudentNowDars() {
        return studentNowDars;
    }

    public void setStudentNowDars(DarsKaar SampleDars) {
        this.studentNowDars.add(SampleDars);
    }

    public int getStudentAv() {
        return studentAv;
    }

    public void setStudentAv(int studentAv) {
        this.studentAv = studentAv;
    }

    //method
    public boolean entekhaabVaahed(DarsKaar darseEntekhaab) {

        boolean PishNiyaaz = true;
        boolean Tadaakhool = true;
        boolean Zarfiat = true;
        boolean Vooroodi = true;
        boolean Max = true;

        if (studentPassedDars.size() > 0) {

            if (darseEntekhaab.getDarsKaarPish() != null) //PishNiyaaz
            {
                for (int i = 0; i < studentPassedDars.size(); i++) {
                    if (darseEntekhaab.getDarsKaarPish().equals(studentPassedDars.get(i))) {
                        break;
                    } else {
                        System.out.print("Pishniyaaz ra aayat nashode !\n");
                        PishNiyaaz = false;
                    }
                }
            }

            for (int i = 0; i < studentPassedDars.size(); i++) //Tadaakhool
            {
                if (darseEntekhaab.getDarsDay() == studentPassedDars.get(i).getDarsDay()) {
                    if (darseEntekhaab.getDarsTime() == studentPassedDars.get(i).getDarsTime()) {
                        System.out.print("Tadaakhool daare !\n");
                        Tadaakhool = false;
                    }
                }
            }

            if (darseEntekhaab.calculateEmptyCapacity() == 0) //Zarfiat Khaali
            {
                System.out.print("Zarfiyat Dars Takmile !\n");
                Zarfiat = false;
            }

            if (darseEntekhaab.getDarsYear() != getStudentSaaleVoorood()) //SaaleVooroodi And Reshte
            {
                System.out.print("Baraaye Saale Vooroodiye shoma nist !\n");
                Vooroodi = false;
                if (darseEntekhaab.getDarsReshte() != getStudentReshte()) {
                    System.out.print("Reshte gheyre mortabet mibaashad !\n");
                    Vooroodi = false;
                }
            }

            int jamUnits = 0;
            for (int i = 0; i < studentPassedDars.size(); i++) //Max Units
            {
                jamUnits += studentPassedDars.get(i).getDarsUnits();
                if (jamUnits >= student_MAX_Units) {
                    System.out.print("Zarfiyate entekhaab vaahede shoma takmile !\n");
                    Max = false;
                }
            }

        }

        return (PishNiyaaz && Tadaakhool && Zarfiat && Vooroodi && Max);
    }

    @Override
    public String toString() {
        return "Student Kaarshenaasi   [ "
                + " Name = " + getStudentName() + " | "
                + " Last Name = " + getStudentLastName() + " | "
                + " ID = " + getStudentID() + " | "
                + " CodeMelli = " + getStudentCodeMelli() + " | "
                + " Reshte = " + getStudentReshte().getReshteName() + " | "
                + " Term = " + getStudentTerm() + " | "
                + " Saale Voorood = " + getStudentSaaleVoorood() + " | "
                + " Average = " + getStudentAv() + " | "
                + " PassedDars Size = " + getStudentPassedDars().size() + " | "
                + " NowDars Size = " + getStudentNowDars().size() + " ] ";
    }

}
