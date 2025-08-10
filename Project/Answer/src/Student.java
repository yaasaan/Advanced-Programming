
import java.util.*;

public class Student {

    private String studentName;
    private String studentLastName;
    private int studentID; // - - - -
    private String studentCodeMelli;
    private String studentPassword;
    private Reshte studentReshte;
    private int studentTerm;
    protected final int student_MAX_Units = 20;
    private int studentSaaleVoorood;

    //constructor
    public Student(String studentName, String studentLastName, int studentID, String studentCodeMelli, Reshte studentReshte, int studentTerm) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
        this.studentCodeMelli = studentCodeMelli;
        this.studentPassword = studentCodeMelli;
        this.studentReshte = studentReshte;
        this.studentTerm = studentTerm;
    }

    //getter and setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentCodeMelli() {
        return studentCodeMelli;
    }

    public void setStudentCodeMelli(String studentCodeMelli) {
        this.studentCodeMelli = studentCodeMelli;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public Reshte getStudentReshte() {
        return studentReshte;
    }

    public void setStudentReshte(Reshte studentReshte) {
        this.studentReshte = studentReshte;
    }

    public int getStudentTerm() {
        return studentTerm;
    }

    public void setStudentTerm(int studentTerm) {
        this.studentTerm = studentTerm;
    }

    public int getStudentSaaleVoorood() {
        return studentSaaleVoorood;
    }

    public void setStudentSaaleVoorood(int studentID) {
        this.studentSaaleVoorood = getStudentID() / 100;
    }

    //method
}
