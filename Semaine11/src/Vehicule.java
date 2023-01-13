import java.time.LocalDate;

public abstract class  Vehicule {
    private String immatriculation ;
    private LocalDate dateMiseEnCirculation ;
    private LocalDate dateDernierControleTechnique;
    private double kilometrage ;

    public Vehicule(String immatriculation, LocalDate dateMiseEnCirculation) {
        this.immatriculation = immatriculation;
        this.dateMiseEnCirculation = dateMiseEnCirculation;
        this.dateDernierControleTechnique = dateMiseEnCirculation;
    }

    public abstract boolean estEnOrdre();

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    public LocalDate getDateDernierControleTechnique() {
        return dateDernierControleTechnique;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setDateDernierControleTechnique(LocalDate dateDernierControleTechnique) {
        this.dateDernierControleTechnique = dateDernierControleTechnique;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return "\nImmatriculation :  " + immatriculation +  "\ndateMiseEnCirculation: " + dateMiseEnCirculation +
                "\ndateDernierControleTechnique : " + dateDernierControleTechnique + "\nkilometrage : " + kilometrage + "\n" ;
    }

}
