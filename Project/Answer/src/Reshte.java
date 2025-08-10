
import java.util.*;

public class Reshte {

    private String reshteName;
    private int reshteTerm;
    private int reshteAve;
    private String reshteDaaneshKade;
    private ArrayList<Dars> reshteEjbaari;
    private ArrayList<Dars> reshteEkhtiyaari;

    //constractur
    public Reshte(String reshteName, int reshteTerm, int reshteAve, String reshteDaaneshKade) {
        this.reshteName = reshteName;
        this.reshteTerm = reshteTerm;
        this.reshteAve = reshteAve;
        this.reshteDaaneshKade = reshteDaaneshKade;
        this.reshteEjbaari = new ArrayList<Dars>();
        this.reshteEkhtiyaari = new ArrayList<Dars>();
    }

    //getter and setter
    public String getReshteName() {
        return reshteName;
    }

    public void setReshteName(String reshteName) {
        this.reshteName = reshteName;
    }

    public int getReshteTerm() {
        return reshteTerm;
    }

    public void setReshteTerm(int reshteTerm) {
        this.reshteTerm = reshteTerm;
    }

    public int getReshteAve() {
        return reshteAve;
    }

    public void setReshteAve(int reshteAve) {
        this.reshteAve = reshteAve;
    }

    public String getReshteDaaneshKade() {
        return reshteDaaneshKade;
    }

    public void setReshteDaaneshKade(String reshteDaaneshKade) {
        this.reshteDaaneshKade = reshteDaaneshKade;
    }

    public ArrayList<Dars> getReshteEjbaari() {
        return reshteEjbaari;
    }

    public void setReshteEjbaari(ArrayList<Dars> reshteEjbaari) {
        this.reshteEjbaari = reshteEjbaari;
    }

    public ArrayList<Dars> getReshteEkhtiyaari() {
        return reshteEkhtiyaari;
    }

    public void setReshteEkhtiyaari(ArrayList<Dars> reshteEkhtiyaari) {
        this.reshteEkhtiyaari = reshteEkhtiyaari;
    }

    //method
    public void addToDarsEjbaari(Dars sample2) {
        reshteEjbaari.add(sample2);
        sample2.setDarsReshte(this);
    }

    public void addToDarsEkhtiyaari(Dars sample2) {
        reshteEjbaari.add(sample2);
        sample2.setDarsReshte(this);
    }

    @Override
    public String toString() {
        return "Reshte [ "
                + " Name = " + getReshteName() + " | "
                + " Term = " + getReshteTerm() + " | "
                + " Average = " + getReshteAve() + " | "
                + " DaaneshKade = " + getReshteDaaneshKade() + " | "
                + " Dars Ejbaari list size = " + reshteEjbaari.size() + " | "
                + " Dars Ekhtiyaari list size = " + reshteEkhtiyaari.size() + " ] ";
    }

}
