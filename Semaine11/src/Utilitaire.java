import java.time.LocalDate;

public class Utilitaire extends Vehicule {

    public final static int NOMBRE_MAX_KM_ENTRE_2_CT = 50000 ;
    private int distanceEntre2CT;
    private double kilometrageDernierCT;

    public Utilitaire(String immatriculation, LocalDate dateMiseEnCirculation, int distanceEnttre2CT) {
        super(immatriculation, dateMiseEnCirculation);
        this.distanceEntre2CT = distanceEnttre2CT;
    }

    public Utilitaire(String immatriculation, LocalDate dateMiseEnCirculation) {

        this(immatriculation,dateMiseEnCirculation,NOMBRE_MAX_KM_ENTRE_2_CT);

    }

    public int getDistanceEntre2CT() {
        return distanceEntre2CT;
    }

    public double getKilometrageDernierCT() {
        return kilometrageDernierCT;
    }

    public void setKilometrageDernierCT(double kilometrageDernierCT) {
        this.kilometrageDernierCT = kilometrageDernierCT;
    }

    @Override
    public boolean estEnOrdre() {
        double km = getKilometrage() - kilometrageDernierCT ;
        if (km>distanceEntre2CT)
            return false;

        return true;
    }

    @Override
    public String toString() {
        String s = "Utilitaire : " + super.toString()   ;
        if (estEnOrdre()){
            return s + "L'utilitaire est en ordre" ;
        }else{
            return s + "L'utlitaire n'est pas en ordre" ;
        }
    }
}
