import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AppelTelephonique {
    private LocalDateTime dateEtHeure ;
    private  String numeroAppele;
    private Duration dureeAppel;
    private double tarifParMinute;
    private final static double TARIF_PAR_DEFAUT = 0.15;

    public AppelTelephonique(LocalDateTime dateEtHeure, String numeroAppele, Duration dureeAppel, double tarifParMinute) {
        this.dateEtHeure = dateEtHeure;
        this.numeroAppele = numeroAppele;
        this.dureeAppel = dureeAppel;
        this.tarifParMinute = tarifParMinute;
    }

    public AppelTelephonique(LocalDateTime dateEtHeure, String numeroAppele, Duration dureeAppel) {
        this(dateEtHeure,numeroAppele,dureeAppel, TARIF_PAR_DEFAUT);
    }

    public LocalDateTime getDateEtHeure() {
        return dateEtHeure;
    }

    public String getNumeroAppele() {
        return numeroAppele;
    }

    public Duration getDureeAppel() {
        return dureeAppel;
    }

    public double getTarifParMinute() {
        return tarifParMinute;
    }

    public void setTarifParMinute(double tarifParMinute) {
        this.tarifParMinute = tarifParMinute;
    }

    public double coutAppel (){
        double coutAppel = dureeAppel.toMinutes() * tarifParMinute;
        long secondes = dureeAppel.toSeconds()%60;
        if (secondes > 0){
            coutAppel += tarifParMinute;
        }
        return coutAppel;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String infos = " Appel passé le " + formatter.format(dateEtHeure) + "\n\nDurée de l'appel " + getDureeAppel().toMinutes() + "minutes et " + getDureeAppel().toSeconds()%60 + "secondes . \n" +
                "numero appelé : " + numeroAppele +
                "\nTarif par minute : " + getTarifParMinute() + "$. \n" +
                "Cout d'appel: " + coutAppel()  + " $";

        //TODO complétez en ajoutant les autres informations de l'appel

        return infos;
    }
}
