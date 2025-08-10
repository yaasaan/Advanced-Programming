
import java.util.*;

public class Professor {

    private String professorName;
    private String professorLastName;
    private String professorPassword;
    private int professorID;

    //constructor
    public Professor(String professorName, String professorLastName, String professorPassword, int professorID) {
        this.professorName = professorName;
        this.professorLastName = professorLastName;
        this.professorPassword = professorPassword;
        this.professorID = professorID;
    }
    //getter and setter 

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorLastName() {
        return professorLastName;
    }

    public void setProfessorLastName(String professorLastName) {
        this.professorLastName = professorLastName;
    }

    public String getProfessorPassword() {
        return professorPassword;
    }

    public void setProfessorPassword(String professorPassword) {
        this.professorPassword = professorPassword;
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    //method
    public void addNumOfUnits(int darsUnits) {
    }

    public void addToProfessorSelectedDars(Dars sample) {
    }

}
