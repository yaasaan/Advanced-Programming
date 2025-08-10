
import java.util.*;

public class Dars {

    private int darsID;
    private String darsName;
    private int darsUnits; //1-3
    private int darsTime; //1-8
    private int darsDay; //1-5
    protected int darsCapacity;
    private int darsYear;
    private Reshte darsReshte = null;
    private Professor darsProfessor;
    private ArrayList<Student> darsStudentList = null;

    //constructor
    public Dars(int darsID, String darsName) {
        this.darsName = darsName;
        this.darsID = darsID;
        this.darsStudentList = new ArrayList<>();
    }

    public Dars(int darsID, String darsName, int darsUnits, int darsTime, int darsDay, int darsCapacity, int darsYear, Professor darsProfessor) {
        this(darsID, darsName);
        this.darsUnits = darsUnits;
        this.darsTime = darsTime;
        this.darsDay = darsDay;
        this.darsCapacity = darsCapacity;
        this.darsYear = darsYear;
        setDarsProfessor(darsProfessor);
    }

    //getter and setter
    public int getDarsID() {
        return darsID;
    }

    public void setDarsID(int darsID) {
        this.darsID = darsID;
    }

    public String getDarsName() {
        return darsName;
    }

    public void setDarsName(String darsName) {
        this.darsName = darsName;
    }

    public int getDarsUnits() {
        return darsUnits;
    }

    public void setDarsUnits(int darsUnits) {
        this.darsUnits = darsUnits;
    }

    public int getDarsTime() {
        return darsTime;
    }

    public void setDarsTime(int darsTime) {
        this.darsTime = darsTime;
    }

    public int getDarsDay() {
        return darsDay;
    }

    public void setDarsDay(int darsDay) {
        this.darsDay = darsDay;
    }

    public int getDarsCapacity() {
        return darsCapacity;
    }

    public void setDarsCapacity(int darsCapacity) {
    }

    public int getDarsYear() {
        return darsYear;
    }

    public void setDarsYear(int darsYear) {
        this.darsYear = darsYear;
    }

    public Reshte getDarsReshte() {
        return darsReshte;
    }

    public void setDarsReshte(Reshte darsReshte) {
        this.darsReshte = darsReshte;
    }

    public Professor getDarsProfessor() {
        return darsProfessor;
    }

    public void setDarsProfessor(Professor darsProfessor) {
        this.darsProfessor = darsProfessor;
        darsProfessor.addNumOfUnits(darsUnits);
        darsProfessor.addToProfessorSelectedDars(this);
    }

    public ArrayList<Student> getDarsStudentList() {
        return darsStudentList;
    }

    public void setDarsStudentList(Student sampleStudent) {
        this.darsStudentList.add(sampleStudent);
    }

    //method
    public int calculateEmptyCapacity() {
        return getDarsCapacity() - darsStudentList.size();
    }

    public void increaseCapacity(int darsNewCapacity) {
    }
;

}
