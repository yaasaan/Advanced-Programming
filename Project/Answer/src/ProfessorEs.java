
import java.util.*;

public class ProfessorEs extends Professor {

    protected int professorNumOfUnit;
    private int professorRank;
    private int professorYears;
    private ArrayList<Dars> professorSelectedDars;

    //constructor
    public ProfessorEs(String professorName, String professorLastName, String professorPassword, int professorID, int professorRank, int professorYears) {
        super(professorName, professorLastName, professorPassword, professorID);
        this.professorRank = professorRank;
        this.professorYears = professorYears;
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

    public int getProfessorYears() {
        return professorYears;
    }

    public void setProfessorYears(int professorYears) {
        this.professorYears = professorYears;
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
                + "Years : " + getProfessorYears() + " | "
                + "Professor Selected Dars Size: " + getProfessorSelectedDars().size() + " | "
                + "professor Number Of Unit : " + getProfessorNumOfUnit() + " ] ";
    }

}
