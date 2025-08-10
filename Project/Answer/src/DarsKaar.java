
import java.util.*;

public class DarsKaar extends Dars {

    private final int Dars_MAX_Capacity;
    private Dars darsKaarPish = null;

    //constructor
    public DarsKaar(int darsID, String darsName) {
        super(darsID, darsName);
        this.Dars_MAX_Capacity = 30;
    }

    public DarsKaar(int darsID, String darsName, int darsUnits, int darsTime, int darsDay, int darsCapacity, int darsYear, Professor darsProfessor, Dars darsKaarPish) {
        super(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, darsProfessor);
        this.Dars_MAX_Capacity = 30;
        setDarsKaarPish(darsKaarPish);
    }

    //getter and setter
    public Dars getDarsKaarPish() {
        return darsKaarPish;
    }

    public void setDarsKaarPish(Dars darsKaarPish) {
        this.darsKaarPish = darsKaarPish;
    }

    //method
    public void setDarsCapacity(int darsCapacity) {
        if (darsCapacity <= Dars_MAX_Capacity) {
            this.darsCapacity = darsCapacity;
        }
    }

    public void setDarsStudentList(StudentKaar sampleStudent) {
        getDarsStudentList().add(sampleStudent);
    }

    public void increaseCapacity(int darsNewCapacity) {
        if (darsNewCapacity <= Dars_MAX_Capacity) {
            darsCapacity = darsNewCapacity;
        }
    }

    @Override
    public String toString() {
        return "Dars Kaarshenaasi  [ "
                + "ID = " + getDarsID() + " | "
                + " Name = " + getDarsName() + " | "
                + " Units = " + getDarsUnits() + " | "
                + " Capacity = " + getDarsCapacity() + " | "
                + " Empty Capacity = " + calculateEmptyCapacity() + " | "
                + " Time = " + getDarsTime() + " | "
                + " Day = " + getDarsDay() + " | "
                + " Year = " + getDarsYear() + " | "
                + " Professor = " + getDarsProfessor().getProfessorName() + " | "
                + " Student List Size = " + getDarsStudentList().size() + " ] ";
    }

}
