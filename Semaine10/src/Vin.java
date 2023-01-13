public class Vin extends BoissonAlcoolisee {

    private String cepage;
    private String couleur;
    private String region;
    private String pays;
    private final static String[] COULEURS_POSSIBLES ={"rouge", "blanc", "rosé"};
    public Vin(String nom, int contenance, double prix, double degreDAlcool, String cepage, String couleur, String region, String pays) {
        super(nom, contenance, prix, degreDAlcool);
        this.cepage = cepage;
        for (String c : COULEURS_POSSIBLES ) {
            if(c.equals(couleur)) {
                this.couleur = couleur;
                break;
            }
        }
        if(this.couleur==null) throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        this.region = region;
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "vin "+ couleur + " : "+ super.toString()+"\nCépage : " + cepage +"\nOrigine : " +
                region + " - " + pays ;
    }
}
