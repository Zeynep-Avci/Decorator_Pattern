package at.ac.fhcampuswien;

public class Garnelen implements Gericht{
    public void druckeBeschreibung() {
        System.out.print("Garnelen");
    }
    public double getPreis() {
        return 13.50;
    }
}
