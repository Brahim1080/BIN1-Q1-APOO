public class Biere extends BoissonAlcoolisee {

    private boolean pression;
    public Biere(String nom, int contenance, double prix, double degreDAlcool, boolean pression) {
        super(nom, contenance, prix, degreDAlcool);
        this.pression = pression;
    }

    public boolean isPression() {
        return pression;
    }


    @Override
    public String toString() {
        String s = super.toString();
        if(pression) {
            return "Bière pression : " + s;
        } else {
            return "Bière bouteille : " + s;
        }

        //autre manière :
        // return "Bière " + (pression ? "pression" : "bouteille") +" "+super.toString();
    }
}
