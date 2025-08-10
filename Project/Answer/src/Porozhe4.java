
import java.util.*;
import java.util.ArrayList;

public class Porozhe4 {

    static Scanner input = new Scanner(System.in);
    static String adminUserName;
    static String adminPassword;
    static ArrayList<Professor> professorList = new ArrayList<>();
    static ArrayList<Dars> darsList = new ArrayList<>();
    static ArrayList<Reshte> reshteList = new ArrayList<>();
    static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Please Enter Admin User Name : ");
        adminUserName = input.next();
        System.out.println("Please Enter Admin Password : ");
        adminPassword = input.next();
        start();
    }

    public static void start() {

        System.out.println("\n\nWelcom ! \n 0 : Admin\n 1 : Dars\n 2 : Student\n 3 : Professor\n");
        int num1 = input.nextInt();
        if (num1 == 0) //Admin
        {
            adminLogin();
        }

        if (num1 == 1) // Dars
        {
            darsLogin();
        }

        if (num1 == 2) // Student
        {
            studentLogin();
        }

        if (num1 == 3) // Professor 
        {
            professorLogin();
        }

    }

    //====================================================================================================================================
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
                System.out.println("\n\nWelcome admin !");
                adminChoice();
            }
        }
    }

    public static void adminChoice() { // 0 : Admin 

        System.out.println("\n0 : Professor \n1 : Dars \n2 : Reshte \n3 : Student \n9 : Exit");
        int num1 = input.nextInt();

        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (num1 == 0)// 0 :Professor
        {
            System.out.println("\n0 : Add \n1 : Show\n9 : Exit");
            int num2 = input.nextInt();

            if (num2 == 0) // 0 : Add
            {
                for (int i = 0;; i++) {
                    System.out.println("\nAdd New Professor :");
                    System.out.println("0 : Add\n9 : Exit");
                    int num3 = input.nextInt();

                    if (num3 == 0) {
                        System.out.println("\nPlease Enter a Number :\n 0 : Professor Estekhdaadm Shode\n 1 : Professor Movaghat");
                        int num4 = input.nextInt();

                        System.out.println("Professor Name :");
                        String professorName = input.next();
                        System.out.println("Professor Last Name :");
                        String professorLastName = input.next();
                        System.out.println("Professor ID :");
                        int professorID = input.nextInt();
                        System.out.println("Professor Password :");
                        String professorPassword = input.next();
                        System.out.println("Professor Rank :");
                        int professorRank = input.nextInt();

                        if (num4 == 0) // Professor Estekhdaadm Shode
                        {
                            System.out.println("Professor Years :");
                            int professorYears = input.nextInt();
                            ProfessorEs professor = new ProfessorEs(professorName, professorLastName, professorPassword, professorID, professorRank, professorYears);
                            professorList.add(professor);
                        }

                        if (num4 == 1) //Professor Movaghat
                        {
                            System.out.println("Professor Hours :");
                            int professorHours = input.nextInt();
                            ProfessorMo professor = new ProfessorMo(professorHours, professorName, professorLastName, professorPassword, professorID, professorRank);
                            professorList.add(professor);
                        }

                    }

                    if (num3 == 9) {
                        break;
                    }
                }

                adminChoice();
            }

            if (num2 == 1) // 1 : Show
            {
                if (professorList.size() > 0) {
                    System.out.println("\nProfessor List   : ");
                    for (int i = 0; i < professorList.size(); i++) {
                        System.out.println(i + " = " + professorList.get(i).getProfessorName() + " " + professorList.get(i).getProfessorLastName());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    System.out.println(professorList.get(num3));
                } else {
                    System.out.println("Professor List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 9) // 9 : Exit
            {
                adminChoice();
            }
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (num1 == 1)// 1 : Dars
        {
            System.out.println("\n0 : Add \n1 : Show\n9 : Exit");
            int num2 = input.nextInt();

            if (num2 == 0) // 0 : Add
            {
                for (int i = 0;; i++) {
                    System.out.println("\nAdd New Dars :");
                    System.out.println("0 : Add\n9 : Exit");
                    int num3 = input.nextInt();

                    if (num3 == 0) {
                        System.out.println("\nPlease Enter a Number :\n 0 : Kaarshenaasi \n 1 : Kaarshenaasi Arshad ");
                        int num4 = input.nextInt();

                        if (num4 == 0) //Kaarshenaasi
                        {
                            System.out.println("\nPlease Enter a Number :\n 0 : ba ID va Name\n 1 : ba hame khososiyaat");
                            int num5 = input.nextInt();
                            System.out.println("Dars Name :");
                            String darsName = input.next();
                            System.out.println("Dars ID :");
                            int darsID = input.nextInt();

                            if (num5 == 0) //faghat ID
                            {
                                DarsKaar sampleDarsKaar = new DarsKaar(darsID, darsName);
                                darsList.add(sampleDarsKaar);
                            }

                            if (num5 == 1) //Hame
                            {
                                System.out.println("Dars Units :");
                                int darsUnits = input.nextInt();
                                System.out.println("Dars Time :");
                                int darsTime = input.nextInt();
                                System.out.println("Dars Day :");
                                int darsDay = input.nextInt();
                                System.out.println("Dars Capacity :");
                                int darsCapacity = input.nextInt();
                                System.out.println("Dars Year :");
                                int darsYear = input.nextInt();
                                System.out.println("Dars Professor :");
                                for (int j = 0; j < professorList.size(); j++) {
                                    System.out.println(j + " = " + professorList.get(j).getProfessorName() + " " + professorList.get(j).getProfessorLastName());
                                }
                                System.out.println("\nChoose one : ");
                                int num6 = input.nextInt();

                                System.out.println("\nDars Pishniyaaz Dare ?\n 0 : Yes\n 1 : No ");
                                int num7 = input.nextInt();
                                if (num7 == 0) {
                                    for (int j = 0; j < darsList.size(); j++) {
                                        System.out.println(j + " = " + darsList.get(j).getDarsName());
                                    }
                                    System.out.println("\nChoose one : ");
                                    int num8 = input.nextInt();
                                    DarsKaar sampleDarsKaar = new DarsKaar(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, professorList.get(num6), darsList.get(num8));
                                    darsList.add(sampleDarsKaar);
                                }
                                if (num7 == 1) {
                                    DarsKaar sampleDarsKaar = new DarsKaar(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, professorList.get(num6), null);
                                    darsList.add(sampleDarsKaar);
                                }
                            }
                        }

                        if (num4 == 1) //Kaarshenaasi Arshad
                        {
                            System.out.println("\nPlease Enter a Number :\n 0 : ba ID va Name\n 1 : ba hame khososiyaat");
                            int num5 = input.nextInt();
                            System.out.println("Dars Name :");
                            String darsName = input.next();
                            System.out.println("Dars ID :");
                            int darsID = input.nextInt();

                            if (num5 == 0) //faghat ID
                            {
                                DarsArshad sampleDarsArshad = new DarsArshad(darsID, darsName);
                                darsList.add(sampleDarsArshad);
                            }

                            if (num5 == 1) //Hame
                            {
                                System.out.println("Dars Units :");
                                int darsUnits = input.nextInt();
                                System.out.println("Dars Time :");
                                int darsTime = input.nextInt();
                                System.out.println("Dars Day :");
                                int darsDay = input.nextInt();
                                System.out.println("Dars Capacity :");
                                int darsCapacity = input.nextInt();
                                System.out.println("Dars Year :");
                                int darsYear = input.nextInt();
                                System.out.println("Dars Professor :");
                                for (int j = 0; j < professorList.size(); j++) {
                                    System.out.println(j + " = " + professorList.get(j).getProfessorName() + " " + professorList.get(j).getProfessorLastName());
                                }
                                System.out.println("\nChoose one : ");
                                int num6 = input.nextInt();

                                System.out.println("Dars Pishniyaaz Dare ?\n 0 : Yes\n 1 : No ");
                                int num7 = input.nextInt();
                                if (num7 == 0) {
                                    for (int j = 0; j < darsList.size(); j++) {
                                        System.out.println(j + " = " + darsList.get(j).getDarsName());
                                    }
                                    System.out.println("\nChoose one : ");
                                    int num8 = input.nextInt();
                                    DarsArshad sampleDarsArshad = new DarsArshad(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, professorList.get(num6), darsList.get(num8), 1);
                                    darsList.add(sampleDarsArshad);
                                }
                                if (num7 == 1) {
                                    DarsArshad sampleDarsArshad = new DarsArshad(darsID, darsName, darsUnits, darsTime, darsDay, darsCapacity, darsYear, professorList.get(num6), null, 1);
                                    darsList.add(sampleDarsArshad);
                                }

                            }
                        }

                    }

                    if (num3 == 9) {
                        break;
                    }
                }
                adminChoice();
            }

            if (num2 == 1) // 1 : Show
            {
                if (darsList.size() > 0) {
                    System.out.println("Dars List  :");
                    for (int i = 0; i < darsList.size(); i++) {
                        System.out.println(i + " = " + darsList.get(i).getDarsName() + "  |  " + darsList.get(i).getDarsProfessor().getProfessorName());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    System.out.println(darsList.get(num3));
                } else {
                    System.out.println("Dars List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 9) // 9 : Exit
            {
                adminChoice();
            }
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (num1 == 2)// 2 : Reshte
        {
            System.out.println("\n0 : Add \n1 : Show\n2 : Add Dars\n9 : Exit");
            int num2 = input.nextInt();

            if (num2 == 0) // 0 : Add
            {
                for (int i = 0;; i++) {
                    System.out.println("\nAdd New Reshte :");
                    System.out.println("0 : Add\n9 : Exit");
                    int num3 = input.nextInt();

                    if (num3 == 0) {
                        System.out.println("Reshte Name :");
                        String reshteName = input.next();
                        System.out.println("Reshte Daaneshkade :");
                        String reshteDaaneshKade = input.next();
                        System.out.println("Reshte Term :");
                        int reshteTerm = input.nextInt();
                        System.out.println("Reshte Average :");
                        int reshteAve = input.nextInt();
                        Reshte sampleReshte = new Reshte(reshteName, reshteTerm, reshteAve, reshteDaaneshKade);
                        reshteList.add(sampleReshte);
                    }

                    if (num3 == 9) {
                        break;
                    }
                }
                adminChoice();
            }

            if (num2 == 1) // 1 : Show
            {
                if (reshteList.size() > 0) {
                    System.out.println("Reshte List :");
                    for (int i = 0; i < reshteList.size(); i++) {
                        System.out.println(i + " = " + reshteList.get(i).getReshteName());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    System.out.println(reshteList.get(num3));
                } else {
                    System.out.println("Reshte List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 2) // 2 : Add Dars
            {
                System.out.println("Reshte List  :");
                if (reshteList.size() > 0) {
                    for (int i = 0; i < reshteList.size(); i++) {
                        System.out.println(i + " = " + reshteList.get(i).getReshteName());
                    }
                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    Reshte sampleReshte = reshteList.get(num3);
                    if (darsList.size() > 0) {
                        System.out.println("Dars List  :");
                        for (int i = 0; i < darsList.size(); i++) {
                            System.out.println(i + " = " + darsList.get(i).getDarsName() + "   (   " + darsList.get(i).getDarsID() + "   )   ");
                        }
                        System.out.println("\nChoose one : ");
                        int num4 = input.nextInt();
                        Dars sampleDars = darsList.get(num4);

                        System.out.println("0 : Darse Ejbaari\n1 : Darse Ekhtiyaari !");
                        int num5 = input.nextInt();

                        if (num5 == 0) {
                            sampleReshte.addToDarsEjbaari(sampleDars);
                        }
                        if (num5 == 1) {
                            sampleReshte.addToDarsEkhtiyaari(sampleDars);
                        }
                    } else {
                        System.out.println("Dars List is Empty !\n");
                    }
                } else {
                    System.out.println("Reshte List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 9) // 9 : Exit
            {
                adminChoice();
            }
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (num1 == 3)// 3 : Student
        {
            System.out.println("\n0 : Add \n1 : Show\n2 : Entekhaab Vaahed\n3 : Edit Term\n9 : Exit");
            int num2 = input.nextInt();

            if (num2 == 0) // 0 : Add
            {
                for (int i = 0;; i++) {
                    System.out.println("\nAdd New Student :");
                    System.out.println("0 : Add\n9 : Exit");
                    int num3 = input.nextInt();

                    if (num3 == 0) {

                        ArrayList<DarsArshad> studentPassedDarsArshad = new ArrayList<>();
                        ArrayList<DarsKaar> studentPassedDarsKaar = new ArrayList<>();

                        System.out.println("\nPlease Enter a Number :\n 0 : Student Kaarshenaasi (Pro)\n 1 : Student Kaarshenaasi (Normal)\n 2 : Student Karshenaasi Arshad\n");
                        int num4 = input.nextInt();

                        System.out.println("Student Name  :");
                        String studentName = input.next();
                        System.out.println("Student LastName  :");
                        String studentLastName = input.next();
                        System.out.println("Student ID :");
                        int studentID = input.nextInt();
                        System.out.println("Student CodeMelli  :");
                        String studentCodeMelli = input.next();
                        System.out.println("Student Term  :");
                        int studentTerm = input.nextInt();
                        System.out.println("Student Average  :");
                        int studentAv = input.nextInt();

                        System.out.println("Student Reshte  :");
                        for (int j = 0; j < reshteList.size(); j++) {
                            System.out.println(j + " = " + reshteList.get(j).getReshteName());
                        }
                        System.out.println("\nChoose one : ");
                        int num5 = input.nextInt();

                        if (num4 == 0) //0 : Student Kaarshenaasi (Pro)
                        {
                            System.out.print("Lessons passed : \n");
                            for (int j = 0; j < darsList.size(); j++) {
                                System.out.println(j + " = " + darsList.get(j).getDarsName());
                            }
                            System.out.print("\nHow many Dars Passed?\n");
                            int num6 = input.nextInt();
                            if (num6 != 0) {
                                for (int j = 0; j < num6; j++) {
                                    System.out.print("\nEnter a Number of Dars :  ");
                                    int num7 = input.nextInt();
                                    studentPassedDarsKaar.add((DarsKaar) darsList.get(num7));
                                }
                            }

                            System.out.println("Reshte List  :");
                            for (int j = 0; j < reshteList.size(); j++) {
                                System.out.println(j + " = " + reshteList.get(j).getReshteName());
                            }
                            System.out.println("\nChoose one(Reshte 2 ) : ");
                            int num7 = input.nextInt();
                            StudentKaarPro sampleStudent = new StudentKaarPro(studentName, studentLastName, studentID, studentCodeMelli, reshteList.get(num5), studentTerm, studentAv, studentPassedDarsKaar, reshteList.get(num7));
                            studentList.add(sampleStudent);
                        }

                        if (num4 == 1) //1 : Student Kaarshenaasi (Normal)
                        {
                            System.out.print("Lessons passed : \n");
                            for (int j = 0; j < darsList.size(); j++) {
                                System.out.println(j + " = " + darsList.get(j).getDarsName());
                            }
                            System.out.print("\nHow many Dars Passed?\n");
                            int num6 = input.nextInt();
                            if (num6 != 0) {
                                for (int j = 0; j < num6; j++) {
                                    System.out.print("\nEnter a Number of Dars :  ");
                                    int num7 = input.nextInt();
                                    studentPassedDarsKaar.add((DarsKaar) darsList.get(num7));
                                }
                            }

                            StudentKaarNormal sampleStudent = new StudentKaarNormal(studentName, studentLastName, studentID, studentCodeMelli, reshteList.get(num5), studentTerm, studentAv, studentPassedDarsKaar);
                        }

                        if (num4 == 2) //2 : Student Karshenaasi Arshad
                        {
                            System.out.print("Lessons passed : \n");
                            for (int j = 0; j < darsList.size(); j++) {
                                System.out.println(j + " = " + darsList.get(j).getDarsName());
                            }
                            System.out.print("\nHow many Dars Passed?\n");
                            int num6 = input.nextInt();
                            if (num6 != 0) {
                                for (int j = 0; j < num6; j++) {
                                    System.out.print("\nEnter a Number of Dars :  ");
                                    int num7 = input.nextInt();
                                    studentPassedDarsArshad.add((DarsArshad) darsList.get(num7));
                                }
                            }

                            StudentArshad sampleStudent = new StudentArshad(studentName, studentLastName, studentID, studentCodeMelli, reshteList.get(num5), studentTerm, studentAv, studentPassedDarsArshad, 1);
                            studentList.add(sampleStudent);
                        }
                    }

                    if (num3 == 9) {
                        break;
                    }
                }

                adminChoice();
            }

            if (num2 == 1) // 1 : Show
            {
                if (studentList.size() > 0) {
                    System.out.println("Student List  :");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(i + " = " + studentList.get(i).getStudentName() + "  |  " + studentList.get(i).getStudentLastName() + "  |  " + studentList.get(i).getStudentID());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    System.out.println(studentList.get(num3));
                } else {
                    System.out.println("Student List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 2) // 2 : Entekhaab Vaahed
            {

                if (studentList.size() > 0) {
                    System.out.println("Student List  :");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(i + " = " + studentList.get(i).getStudentName() + "  |  " + studentList.get(i).getStudentLastName() + "  |  " + studentList.get(i).getStudentID());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    System.out.println("\nPlease Enter a Number :\n 0 : Student Kaarshenaasi\n 1 : Student Karshenaasi Arshad\n");
                    int num4 = input.nextInt();

                    if (num4 == 0) //0 : Student Kaarshenaasi
                    {
                        StudentKaar sampleStudent = (StudentKaar) studentList.get(num3);

                        if (darsList.size() > 0) {

                            for (int i = 0; i < darsList.size(); i++) {
                                System.out.println("\nSelect New Dars For Student :");
                                System.out.println("0 : Add\n9 : Exit");
                                int num5 = input.nextInt();

                                if (num5 == 0) {

                                    System.out.println("Dars List  :");
                                    for (int j = 0; j < darsList.size(); j++) {
                                        System.out.println(j + " = " + darsList.get(j).getDarsName() + "  |  " + darsList.get(j).getDarsProfessor().getProfessorName());
                                    }

                                    System.out.println("\nChoose one : ");
                                    int num6 = input.nextInt();
                                    DarsKaar sampleDars = (DarsKaar) darsList.get(num6);

                                    if (sampleStudent.entekhaabVaahed(sampleDars) == true) {
                                        sampleStudent.setStudentNowDars(sampleDars);
                                        sampleDars.setDarsStudentList(sampleStudent);
                                        System.out.println("\nDars entekhaab shod  ! \n\n");
                                    } else {
                                        System.out.println("\nSharaayete Entekhaab  vaahedo ra aayat nakardid ! \n\n");
                                    }

                                }
                                if (num5 == 9) {
                                    break;
                                }
                            }

                        } else {
                            System.out.println("Dars List is Empty !\n");
                        }

                    }

                    if (num4 == 1) //1 : Student Karshenaasi Arshad
                    {
                        StudentArshad sampleStudent = (StudentArshad) studentList.get(num3);

                        if (darsList.size() > 0) {

                            for (int i = 0; i < darsList.size(); i++) {
                                System.out.println("\nSelect New Dars For Student :");
                                System.out.println("0 : Add\n9 : Exit");
                                int num5 = input.nextInt();

                                if (num5 == 0) {

                                    System.out.println("Dars List  :");
                                    for (int j = 0; j < darsList.size(); j++) {
                                        System.out.println(j + " = " + darsList.get(j).getDarsName() + "  |  " + darsList.get(j).getDarsProfessor().getProfessorName());
                                    }

                                    System.out.println("\nChoose one : ");
                                    int num6 = input.nextInt();
                                    DarsArshad sampleDars = (DarsArshad) darsList.get(num6);

                                    if (sampleStudent.entekhaabVaahed(sampleDars) == true) {
                                        sampleStudent.setStudentNowDars(sampleDars);
                                        sampleDars.setDarsStudentList(sampleStudent);
                                        System.out.println("\nDars entekhaab shod  ! \n\n");
                                    } else {
                                        System.out.println("\nSharaayete Entekhaab  vaahedo ra aayat nakardid ! \n\n");
                                    }

                                }
                                if (num5 == 9) {
                                    break;
                                }
                            }

                        } else {
                            System.out.println("Dars List is Empty !\n");
                        }

                    }

                } else {
                    System.out.println("Student List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 3) // 3 : Edit Term
            {
                if (studentList.size() > 0) {
                    System.out.println("Student List  :");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(i + " = " + studentList.get(i).getStudentName() + "  |  " + studentList.get(i).getStudentLastName() + "  |  " + studentList.get(i).getStudentID());
                    }

                    System.out.println("\nChoose one : ");
                    int num3 = input.nextInt();
                    Student sampleStudent = studentList.get(num3);

                    System.out.println("\nEnter Student New Term : ");
                    int studentNewTerm = input.nextInt();
                    sampleStudent.setStudentTerm(studentNewTerm);

                } else {
                    System.out.println("Student List is Empty !\n");
                }

                adminChoice();
            }

            if (num2 == 9) // 9 : Exit
            {
                adminChoice();
            }
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (num1 == 9)// 9 : Exit
        {
            start();
        }
    }

    //====================================================================================================================================
    public static void darsLogin() {//dars Login
        Dars sampleDars = null;
        System.out.println("Please Enter ID : ");
        int id = input.nextInt();
        int num1 = 0;

        for (int i = 0; i < darsList.size(); i++) {
            if (id != darsList.get(i).getDarsID()) {
                continue;
            } else {
                num1 = 1;
                sampleDars = darsList.get(i);
                break;
            }
        }

        if (num1 == 0) {
            System.out.println("Dars Not exist !\n");
            darsLogin();
        }
        if (num1 == 1) {

            darsChoice(sampleDars);
        }
    }

    public static void darsChoice(Dars sampleDars) { // 1 : dars
        System.out.println("\nWelcome to Dars Information !");
        System.out.println("0 : Show Related Students\n1 : Edit Capacity\n9 : Exit");
        int num1 = input.nextInt();

        if (num1 == 0) // Show Related Students
        {
            System.out.println(sampleDars.getDarsStudentList());
        }

        if (num1 == 1) // Edit Capacity
        {
            System.out.println("\nEnter New Capacity For Dars : ");
            int darsNewCapacity = input.nextInt();
            sampleDars.setDarsCapacity(darsNewCapacity);
        }

        if (num1 == 9) // Exit
        {
            start();
        }
        darsChoice(sampleDars);
    }

    //====================================================================================================================================
    public static void studentLogin() { //student Login
        StudentKaar sampleStudentKaar = null;
        StudentArshad sampleStudentArshad = null;
        System.out.println("Please Enter ID : ");
        int id = input.nextInt();
        int num1 = 0;
        for (int i = 0; i < studentList.size(); i++) {

            if (id != studentList.get(i).getStudentID()) {
                continue;
            } else {
                System.out.println("Please Enter Password : ");
                String password = input.next();
                if (password.compareTo(studentList.get(i).getStudentPassword()) != 0) {
                    System.out.println("Wrong Password !\n");
                    studentLogin();
                } else {
                    System.out.println("\n0 : Student Kaar \n1 : Student Arshad\n");
                    int num2 = input.nextInt();
                    if (num2 == 0) {
                        num1 = 1;
                        sampleStudentKaar = (StudentKaar) studentList.get(i);
                        break;
                    }
                    if (num2 == 1) {
                        num1 = 2;
                        sampleStudentArshad = (StudentArshad) studentList.get(i);
                        break;
                    }
                }
            }
        }
        if (num1 == 0) {
            System.out.println("Student Not exist !\n");
            studentLogin();
        }
        if (num1 == 1) {

            studentChoice(sampleStudentKaar);
        }
        if (num1 == 2) {
            studentChoice(sampleStudentArshad);
        }

    }

    public static void studentChoice(StudentKaar sampleStudentKaar) { // 1 : Student
        System.out.println("\nWelcome to Student Information !");
        System.out.println("0 : Show My Dars\n1 : Edit Password\n9 : Exit");
        int num1 = input.nextInt();

        if (num1 == 0) // Show My Dars
        {
            System.out.println(sampleStudentKaar.getStudentNowDars());
        }

        if (num1 == 1) // Edit Password
        {
            System.out.println("\nEnter New Password : ");
            String studentNewPassword = input.next();
            sampleStudentKaar.setStudentPassword(studentNewPassword);
        }

        if (num1 == 9) // Exit
        {
            start();
        }
        studentChoice(sampleStudentKaar);
    }

    public static void studentChoice(StudentArshad sampleStudentArshad) { // 1 : Student
        System.out.println("\nWelcome to Student Information !");
        System.out.println("0 : Show My Dars\n1 : Edit Password\n9 : Exit");
        int num1 = input.nextInt();

        if (num1 == 0) // Show My Dars
        {

            System.out.println(sampleStudentArshad.getStudentNowDars());
        }

        if (num1 == 1) // Edit Password
        {
            System.out.println("\nEnter New Password : ");
            String studentNewPassword = input.next();
            sampleStudentArshad.setStudentPassword(studentNewPassword);
        }

        if (num1 == 9) // Exit
        {
            start();
        }
        studentChoice(sampleStudentArshad);
    }

    //====================================================================================================================================
    public static void professorLogin() { //professor Login
        Professor samplePerofessor = null;
        System.out.println("Please Enter ID : ");
        int id = input.nextInt();
        int num1 = 0;
        for (int i = 0; i < professorList.size(); i++) {

            if (id != professorList.get(i).getProfessorID()) {
                continue;
            } else {
                System.out.println("Please Enter Password : ");
                String password = input.next();
                if (password.compareTo(professorList.get(i).getProfessorPassword()) != 0) {
                    System.out.println("Wrong Password !\n");
                    professorLogin();
                } else {
                    num1 = 1;
                    samplePerofessor = professorList.get(i);
                    break;
                }
            }
        }
        if (num1 == 0) {
            System.out.println("Professor Not exist !\n");
            professorLogin();
        }
        if (num1 == 1) {

            professorChoice(samplePerofessor);
        }
    }

    public static void professorChoice(Professor samplePerofessor) {// Professor
        System.out.println("\nWelcome Professor !");
        System.out.println("0 : Show My Info\n9 : Exit");
        int num1 = input.nextInt();

        if (num1 == 0) {
            System.out.println(samplePerofessor);
        }

        if (num1 == 9) {
            start();
        }
        professorChoice(samplePerofessor);
    }
}
