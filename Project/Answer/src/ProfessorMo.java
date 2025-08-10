
import java.util.*;

public class ProfessorMo extends Professor {

    private int professorNumOfUnit;
    private int professorRank;
    private int professorHours;
    private ArrayList<Dars> professorSelectedDars;

    //constructor
    public ProfessorMo(int professorHours, String professorName, String professorLastName, String professorPassword, int professorID, int professorRank) {
        super(professorName, professorLastName, professorPassword, professorID);
        this.professorHours = professorHours;
        this.professorRank = professorRank;
        this.professorNumOfUnit = 0;
        this.professorSelectedDars = new ArrayList<Dars>();
    }
    //getter and setter

    public int getProfessorNumOfUnit() {
        return professorNumOfUnit;
    }

    public void setProfessorNumOfUnit(int professorNumOfUnit) {
        this.professorNumOfUnit = professorNumOfUnit;
    }

    public int getProfessorRank() {
        return professorRank;
    }

    public void setProfessorRank(int professorRank) {
        this.professorRank = professorRank;
    }

    public int getProfessorHours() {
        return professorHours;
    }

    public void setProfessorHours(int professorHours) {
        this.professorHours = professorHours;
    }

    public ArrayList<Dars> getProfessorSelectedDars() {
        return professorSelectedDars;
    }

    public void setProfessorSelectedDars(ArrayList<Dars> professorSelectedDars) {
        this.professorSelectedDars = professorSelectedDars;
    }

    //method
    public void addNumOfUnits(int darsUnits) {
        this.professorNumOfUnit += darsUnits;
    }

    public void addToProfessorSelectedDars(Dars sample) {
        this.professorSelectedDars.add(sample);
    }

    @Override
    public String toString() {
        return "Professor Estekhdaam Shode [ "
                + "Name : " + getProfessorName() + " | "
                + "LastName : " + getProfessorLastName() + " | "
                + "ID : " + getProfessorID() + " | "
                + "Rank : " + getProfessorRank() + " | "
                + "Hours : " + getProfessorHours() + " | "
                + "Professor Selected Dars Size: " + getProfessorSelectedDars().size() + " | "
                + "professor Number Of Unit : " + getProfessorNumOfUnit() + " ] ";
    }
}
