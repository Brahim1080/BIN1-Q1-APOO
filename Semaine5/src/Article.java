public class Article {
    private String reference;
    private String nom;
    private String description;
    private double prixHorsTVA;
    private double TVA = 21;
    public Article(String reference, String nom, String description, double prixHorsTVA){
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHorsTVA = prixHorsTVA;
    }
    public Article(String reference, String nom, String description, double prixHorsTVA, double TVA){
        this(reference, nom, description, prixHorsTVA);
        this.TVA = TVA;
    }
    public String getNom() {
        return nom;
    }

    public double getPrixHorsTVA() {
        return prixHorsTVA;
    }

    public String getDescription() {
        return description;
    }

    public String getReference() {
        return reference;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrixHorsTVA(double prixHorsTVA) {
        this.prixHorsTVA = prixHorsTVA;
    }

    public void setTVA(double TVA) {
        this.TVA = TVA;
    }

    public double getTVA() {
        return TVA;
    }
    public double calculerPrixTVAComprise(){
        return this.prixHorsTVA + this.prixHorsTVA*TVA/100;
    }
    public double calculerPrixTVAComprise(double reduction){
        double PourcentageTvaEtPrix = 1.0 + TVA/100;
        double PourcentageReduction = (100-reduction)/100;
        return this.prixHorsTVA *PourcentageTvaEtPrix *PourcentageReduction;
    }

    @Override
    public String toString(){
        return this.nom + " \nRéférence: " + this.reference;
    }
}
