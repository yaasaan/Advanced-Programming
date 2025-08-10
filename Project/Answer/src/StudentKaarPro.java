
import java.util.*;

public class StudentKaarPro extends StudentKaar {

    private Reshte studentReshte2;

    //constructor
    public StudentKaarPro(String studentName, String studentLastName, int studentID, String studentCodeMelli, Reshte studentReshte, int studentTerm, int studentAv, ArrayList<DarsKaar> studentPassedDars, Reshte studentReshte2) {
        super(studentName, studentLastName, studentID, studentCodeMelli, studentReshte, studentTerm, studentAv, studentPassedDars);
        this.studentReshte2 = studentReshte2;

    }

    //getter and setter 
    public Reshte getStudentReshte2() {
        return studentReshte2;
    }

    public void setStudentReshte2(Reshte studentReshte2) {
        this.studentReshte2 = studentReshte2;
    }

}
