import java.time.LocalDate;
import java.time.Month;

public class TestControleTechnique {

    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("1-VSN-789", LocalDate.of(2017,12,25));

        Utilitaire utilitaire1 = new Utilitaire("2-JVL-456",LocalDate.of(2015,5,27));
        Utilitaire utilitaire2 = new Utilitaire("1-DDM-560",LocalDate.of(2017, 1, 25),70000);
        //voiture1.setDateDernierControleTechnique(LocalDate.of(2020,12,25));

        voiture1.setKilometrage(12500);
        System.out.println(voiture1);

        System.out.println();
        utilitaire1.setKilometrage(90000);
        utilitaire1.setKilometrageDernierCT(30000);
        System.out.println(utilitaire1);




    }
}
