
import java.util.*;

public class DarsArshad extends Dars {

    private final int Dars_MAX_Capacity;
    private Dars darsArshadPish = null;
    private ArrayList<DarsKaar> darsKaarPishList;

    //constructor
    public DarsArshad(int darsID, String darsName) {
        super(darsID, darsName);
        this.Dars_MAX_Capacity = 30;
    }

    public DarsArshad(int darsID, String darsName, int darsUnits, int darsTime, int darsDay, int darsCapacity, int darsYear, Professor darsProfessor, Dars darsArshadPish, int a) {
        super(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, darsProfessor);
        this.Dars_MAX_Capacity = 20;
        this.darsKaarPishList = darsKaarPishList;
    }

    //getter and setter 
    public Dars getDarsArshadPish() {
        return darsArshadPish;
    }

    public void setDarsArshadPish(Dars darsArshadPish) {
        this.darsArshadPish = darsArshadPish;
    }

    public ArrayList<DarsKaar> getDarsKaarPishList() {
        return darsKaarPishList;
    }

    public void setDarsKaarPishList(ArrayList<DarsKaar> darsKaarPishList) {
        this.darsKaarPishList = darsKaarPishList;
    }

    //method
    public void setDarsCapacity(int darsCapacity) {
        if (darsCapacity <= Dars_MAX_Capacity) {
            this.darsCapacity = darsCapacity;
        }
    }

    public void setDarsStudentList(StudentArshad sampleStudent) {
        getDarsStudentList().add(sampleStudent);
    }

    public void increaseCapacity(int darsNewCapacity) {
        if (darsNewCapacity <= Dars_MAX_Capacity) {
            darsCapacity = darsNewCapacity;
        }
    }

    @Override
    public String toString() {
        return "Dars Kaarshenaasi Arshad  [ "
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
