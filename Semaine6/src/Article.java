public class Article {
    private String reference;
    private String nom;
    private String description;
    private double prixHorsTVA;
    private double TVA;
    public Article(String reference, String nom, String description, double prixHorsTVA, double TVA){

        if(reference==null)
            throw new IllegalArgumentException("Il n'y a pas de reference");
        this.reference = reference;
        if(nom==null)
            throw new IllegalArgumentException("Il n'y a pas de nom d'article");
        this.nom = nom;

        if(prixHorsTVA<=0)
            throw new IllegalArgumentException("le prix d’un article doit être strictement positif");
        this.prixHorsTVA = prixHorsTVA;
        if (TVA <=0 || TVA>=100)
            throw new IllegalArgumentException("le taux de TVA doit être compris entre 0 et 100 (bornes incluses)");
        this.TVA = TVA;

    }
    public Article(String reference, String nom, String description, double prixHorsTVA){
        this(reference,nom,description,prixHorsTVA,21);
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
        if(reduction<0||reduction>100)
            throw new IllegalArgumentException("une réduction doit être comprise entre 0 et 100 (bornes exclues).");
        return this.prixHorsTVA *PourcentageTvaEtPrix *PourcentageReduction;
    }



    @Override
    public String toString(){
        return this.nom + " \nRéférence: " + this.reference;
    }
}
