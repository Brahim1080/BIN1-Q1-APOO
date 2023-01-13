import java.time.LocalDate;

public class Voiture extends Vehicule {

    public final static int DUREE_AVANR_PREMIER_CT = 4 ;
    public final static int DURRE_MAX_ENTRE_2_CT = 1;


    public Voiture(String immatriculation, LocalDate dateMiseEnCirculation) {
        super(immatriculation, dateMiseEnCirculation);
    }

    @Override
    public boolean estEnOrdre() {
        int annees = DURRE_MAX_ENTRE_2_CT;
        if(getDateDernierControleTechnique().isEqual(getDateMiseEnCirculation())) {
            annees = DUREE_AVANR_PREMIER_CT;
        }
        return !getDateDernierControleTechnique().plusYears(annees).isBefore(LocalDate.now());
    }


    @Override
    public String toString() {
        String s = "Voiture : " + super.toString()   ;
        if (estEnOrdre()){
            return s + "La voiture est en ordre" ;
        }else{
            return s + "La voiture n'est pas en ordre" ;
        }

    }
}
