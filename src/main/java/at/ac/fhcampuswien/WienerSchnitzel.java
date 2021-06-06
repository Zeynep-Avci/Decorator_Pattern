package at.ac.fhcampuswien;

public class WienerSchnitzel implements Gericht{
    public void druckeBeschreibung() {
        System.out.print("WienerSchnitzel");
    }
    public double getPreis() {
        return 10.50;
    }
}
