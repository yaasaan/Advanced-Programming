
import java.util.*;

public class Porozhe2 {
    
    static Student[] listStudent = new Student[40];
    static Dars[] listDars = new Dars[20];
    static String adminUserName;
    static String adminPassword;
    static int j = 0; //Dars
    static int m = 0; //Student
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Please Enter Admin User Name : ");
        adminUserName = input.next();
        System.out.println("Please Enter Admin Password : ");
        adminPassword = input.next();
        start();
    }
    
    public static void start() {
        
        System.out.println("Welcom ! \n 0 : Admin\n 1 : Student\n ?????");
        int x = input.nextInt();
        if (x == 0) //Admin
        {
            adminLogin();
        }
        
        if (x == 1) //Student
        {
            studentLogin();
        }
    }
    
    public static void adminLogin() {  //Admin Login

        System.out.println("Please enter username !");
        String a = input.next();
        if (a.compareTo(adminUserName) != 0) {
            System.out.println("Not exist !\n");
            adminLogin();
        } else {
            System.out.println("Please enter password !");
            String b = input.next();
            if (b.compareTo(adminPassword) != 0) {
                System.out.println("Wrong  !\n");
                adminLogin();
            } else {
                System.out.println("Welcome admin !");
                adminChoice();
            }
        }
    }
    
    public static void adminChoice() { // 0 : Admin 

        System.out.println("0 : Add new Student \n1 : Add New Class \n2 : Edit Class \n3 : entekhaab vaahed \n4 : Delete Class or Student\n9 : exit");
        int t = input.nextInt();
        
        if (t == 0)// 0 :Add new Student
        {
            int z = 0;
            for (; z == 0; m++) {
                System.out.println("\n0 : Add new Student \n1 : back");
                z = input.nextInt();
                if (z == 0) {
                    listStudent[m] = new Student();
                    System.out.println("Please enter Student Name !");
                    String studentName = input.next();
                    listStudent[m].setStudentName(studentName);
                    
                    System.out.println("Please enter Student LastName !");
                    String studentLastName = input.next();
                    listStudent[m].setStudentLastName(studentLastName);
                    
                    System.out.println("Please enter Student ID !");
                    long studentID = input.nextInt();
                    listStudent[m].setStudentID(studentID);
                    
                    System.out.println("Please enter Student CodeMelli !");
                    long studentCodemelli = input.nextInt();
                    listStudent[m].setStudentCodeMelli(studentCodemelli);
                    
                } else {
                    adminChoice();
                }
            }
            
        }
        if (t == 1)// 1 : Add New Class
        {
            int z = 0;
            for (; z == 0; j++) {
                System.out.println("\n0 : Add new Class \n1 : back");
                z = input.nextInt();
                if (z == 0) {
                    listDars[j] = new Dars();
                    System.out.println("Please enter Dars ID !");
                    String darsID = input.next();
                    listDars[j].setDarsID(darsID);
                    
                    System.out.println("Please enter Dars Teacher !");
                    String darsTeacher = input.next();
                    listDars[j].setDarsTeacher(darsTeacher);
                    
                    System.out.println("Please enter Dars Name !");
                    String darsName = input.next();
                    listDars[j].setDarsName(darsName);
                    
                    System.out.println("Please enter Dars Day !\n0 : Saturday\n1 : Sunday\n2 : Monday\n3 : Tuesday\n");
                    String darsDay = input.next();
                    listDars[j].setDarsDay(darsDay);
                    
                    System.out.println("Please enter Dars Pishniyaaz !\nif dont have Pishniyaaz Enter '0' ");
                    String darsPishNiyaaz = input.next();
                    listDars[j].setDarsPishNiyaaz(darsPishNiyaaz);
                    
                    System.out.println("Please enter Dars Vooroodi !");
                    int darsVooroodi = input.nextInt();
                    listDars[j].setDarsVooroodi(darsVooroodi);
                    
                    System.out.println("Please enter Dars Code Reshte !\n11 : Computer \n22 : Mekanik \n33 : bargh \n44 : shimi");
                    int darsCodeReshte = input.nextInt();
                    listDars[j].setDarsCodeReshte(darsCodeReshte);
                    
                    System.out.println("Please enter Dars Time (1-8) !");
                    int darsTime = input.nextInt();
                    listDars[j].setDarsTime(darsTime);
                    
                    System.out.println("Please enter Dars Vaahed !");
                    int darsVaahed = input.nextInt();
                    listDars[j].setDarsVaahed(darsVaahed);
                    
                    System.out.println("Please enter Dars Max Storage !");
                    int darsMaxStorage = input.nextInt();
                    listDars[j].setDarsMaxStorage(darsMaxStorage);
                    
                } else {
                    adminChoice();
                }
            }
        }
        
        if (t == 2)// 2 : Edit Class
        {
            int p = 0;
            System.out.println("Please Enter Dars ID : ");
            String v = input.next();
            int i = 0;
            for (i = 0; i < listDars.length; i++) {
                if (v.compareTo(listDars[i].getDarsID()) == 0) {
                    p = 1;
                    break;
                }
            }
            if (p == 1) {
                System.out.println("Please Edit Dars ID !");
                String darsID = input.next();
                listDars[i].setDarsID(darsID);
                
                System.out.println("Please Edit Dars Teacher !");
                String darsTeacher = input.next();
                listDars[i].setDarsTeacher(darsTeacher);
                
                System.out.println("Please Edit Dars Name !");
                String darsName = input.next();
                listDars[i].setDarsName(darsName);
                
                System.out.println("Please enter Dars Day !\n0 : Saturday\n1 : Sunday\n2 : Monday\n3 : Tuesday\n");
                String darsDay = input.next();
                listDars[i].setDarsDay(darsDay);
                
                System.out.println("Please enter Dars Pishniyaaz !\nif dont have Pishniyaaz Enter '0' ");
                String darsPishNiyaaz = input.next();
                listDars[i].setDarsPishNiyaaz(darsPishNiyaaz);
                
                System.out.println("Please Edit Dars Vooroodi !");
                int darsVooroodi = input.nextInt();
                listDars[i].setDarsVooroodi(darsVooroodi);
                
                System.out.println("Please enter Dars Code Reshte !\n11 : Computer \n22 : Mekanik \n33 : bargh \n44 : shimi");
                int darsCodeReshte = input.nextInt();
                listDars[i].setDarsCodeReshte(darsCodeReshte);
                
                System.out.println("Please Edit Dars Time (1-8)!");
                int darsTime = input.nextInt();
                listDars[i].setDarsTime(darsTime);
                
                System.out.println("Please Edit Dars Vaahed !");
                int darsVaahed = input.nextInt();
                listDars[i].setDarsVaahed(darsVaahed);
                
                System.out.println("Please Edit Dars Max Storage !");
                int darsMaxStorage = input.nextInt();
                listDars[i].setDarsMaxStorage(darsMaxStorage);
                adminChoice();
            }
            if (p == 0) {
                System.out.println("Dars dosent exist");
                adminChoice();
            }
        }
        
        if (t == 3)// 3 : entekhaab vaahed
        {
            
        }
        if (t == 4)// 4 : Delete Class or Student
        {
            System.out.println("\n0 : Delete Student \n1 : Delete Dars ");
            int n = input.nextInt();
            if (n == 0) // Delete Student
            {
                System.out.print("list of students :\n");
                for (int i = 0; i <= m; i++) {
                    System.out.format("%d :\t\t%s %s \n", m, listStudent[m].getStudentName(), listStudent[m].getStudentLastName());
                }
                
                System.out.println("\nWhich one ?");
                int w = input.nextInt();
                for (int i = w; i < m; i++) {
                    listStudent[i] = listStudent[i + 1];
                }
                adminChoice();
            }
            if (n == 1) // Delete Dars
            {
                System.out.print("list of Darss :\n");
                for (int i = 0; i <= j; i++) {
                    System.out.format("%d :\t\t%s\t\t%s\t\t%s \n", j, listDars[j].getDarsName(), listDars[j].getDarsTeacher(), listDars[j].getDarsDay());
                }
                
                System.out.println("\nWhich one ?");
                int w = input.nextInt();
                for (int i = w; i < j; i++) {
                    listDars[i] = listDars[i + 1];
                }
                adminChoice();
            }
        }
        if (t == 9)// 9 : Exit
        {
            start();
        }
    }
    
    public static void studentLogin() { //student Login

        System.out.println("Please enter username !");
        long a = input.nextLong();
        int c = 0;
        int i = 0;
        for (i = 0; i < listStudent.length; i++) {
            if (a != listStudent[i].getStudentID()) {
                c = 0;
                break;
            } else {
                System.out.println("Please enter password !");
                long b = input.nextLong();
                if (b != listStudent[i].getStudentCodeMelli()) {
                    System.out.println("Wrong  !");
                    studentLogin();
                } else {
                    c = 1;
                    break;
                }
            }
        }
        if (c == 0) {
            System.out.println("Not exist !");
            studentLogin();
        }
        if (c == 1) {
            studentChoice(i);
        }
    }
    
    public static void studentChoice(int e) { // 1 : Student
        System.out.println("Welcom student !");
        System.out.println("0 : Leave A Class \n1 : Show Student Class \n9 : exit");
        int r = input.nextInt();
        
        if (r == 0) { // 0 : Leave A Class
            
        }
        if (r == 1) { // 1 : Show Student Class
            for (int i = 0; i < listStudent[e].getStudentDars().length; i++) {
                System.out.format("%s \n", listStudent[e].getStudentDars()[i]);
            }
            studentChoice(e);
        }
        if (r == 9) { // 9 : exit
            start();
        }
    }
}

import java.util.*;

public class Student {

    Scanner input = new Scanner(System.in);

    private String studentName;
    private String studentLastName;
    private long studentID;
    private long studentCodeMelli;
    private int studentVooroodi;
    private int studentCodeReshte;
    private int studentMaxVaahed = 20;
    private Dars[] studentDars = new Dars[10];

    
    
    
    
    
    public boolean checkVooroodiAndReshte(int darsVooroodi, int darsCodeReshte) {
        
        long x=this.studentID/ 100000000;
        this.studentVooroodi = (int) (x/100);
        this.studentCodeReshte=(int) (x%100);
        
        if (this.studentVooroodi != darsVooroodi) {
            return false;
        }
        if (this.studentCodeReshte != darsCodeReshte) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return this.studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getStudentCodeMelli() {
        return this.studentCodeMelli;
    }

    public void setStudentCodeMelli(long studentCodeMelli) {
        this.studentCodeMelli = studentCodeMelli;
    }

    public int getStudentVooroodi() {
        return this.studentVooroodi;
    }

    public void setStudentVooroodi(int studentVooroodi) {
        this.studentVooroodi = studentVooroodi;
    }

    public int getStudentCodeReshte() {
        return this.studentCodeReshte;
    }

    public void setStudentCodeReshte(int studentCodeReshte) {
        this.studentCodeReshte = studentCodeReshte;
    }

    public int getStudentMaxVaahed() {
        return this.studentMaxVaahed;
    }

    public void setStudentMaxVaahed(int studentMaxVaahed) {
        this.studentMaxVaahed = studentMaxVaahed;
    }

    public Dars[] getStudentDars() {
        return this.studentDars;
    }

    public void setStudentDars(Dars[] studentDars) {
        this.studentDars = studentDars;
    }

    public void showInformation() {
        System.out.format("student name : %s \n", getStudentName());
        System.out.format("student last name : %s \n", getStudentLastName());
        System.out.format("student ID : %s \n", getStudentID());
        System.out.format("student code melli: %s \n\n", getStudentCodeMelli());
    }

}

import java.util.*;

public class Dars {

    Scanner input = new Scanner(System.in);

    private String darsID;
    private String darsName;
    private String darsTeacher;
    private String darsDay;
    private String darsPishNiyaaz;
    private int darsVooroodi;
    private int darsCodeReshte;
    private int darsVaahed;
    private int darsTime;//1-8
    private int darsMaxStorage;
    private int darsEmptyStorage;
    private String[] darsStudents;

    public String getDarsID() {
        return this.darsID;
    }

    public void setDarsID(String darsID) {
        this.darsID = darsID;
    }

    public int getDarsVaahed() {
        return this.darsVaahed;
    }

    public void setDarsVaahed(int darsVaahed) {
        this.darsVaahed = darsVaahed;
    }

    public String getDarsName() {
        return this.darsName;
    }

    public void setDarsName(String darsName) {
        this.darsName = darsName;
    }

    public String getDarsDay() {
        return this.darsDay;
    }

    public void setDarsDay(String darsDay) {
        this.darsDay = darsDay;
    }

    public String getDarsPishNiyaaz() {
        return this.darsPishNiyaaz;
    }

    public void setDarsPishNiyaaz(String darsPishNiyaaz) {
        this.darsPishNiyaaz = darsPishNiyaaz;
    }

    public int getDarsVooroodi() {
        return this.darsVooroodi;
    }

    public void setDarsVooroodi(int darsVooroodi) {
        this.darsVooroodi = darsVooroodi;
    }

    public int getDarsCodeReshte() {
        return this.darsCodeReshte;
    }

    public void setDarsCodeReshte(int darsCodeReshte) {
        this.darsCodeReshte = darsCodeReshte;
    }

    public int getDarsTime() {
        return this.darsTime;
    }

    public void setDarsTime(int darsTime) {
        this.darsTime = darsTime;
    }

    public int getDarsMaxStorage() {
        return this.darsMaxStorage;
    }

    public void setDarsMaxStorage(int darsMaxStorage) {
        this.darsMaxStorage = darsMaxStorage;
    }

    public int getDarsEmptyStorage() {
        return this.darsEmptyStorage;
    }

    public void setDarsEmptyStorage(int darsEmptyStorage) {
        this.darsEmptyStorage = darsEmptyStorage;
    }

    public String getDarsTeacher() {
        return this.darsTeacher;
    }

    public void setDarsTeacher(String darsTeacher) {
        this.darsTeacher = darsTeacher;
    }

    public String[] getDarsStudents() {
        return this.darsStudents;
    }

    public void setDarsStudents(String[] darsStudents) {
        this.darsStudents = darsStudents;
    }

    public void showInformation() {
        System.out.format("Dars ID : %s \n", getDarsID());
        System.out.format("Dars Name : %s \n", getDarsName());
        System.out.format("Dars Teacher : %s \n", getDarsTeacher());
        System.out.format("Dars Vaahed : %d \n", getDarsVaahed());
        System.out.format("Dars Time : %d \n", getDarsTime());
        System.out.format("Dars Max Storage : %d \n", getDarsMaxStorage());
        System.out.println("---------------------------------------------------------------------------");

    }
}

