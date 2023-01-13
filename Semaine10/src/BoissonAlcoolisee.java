public class BoissonAlcoolisee extends Boisson {

    private double degreDAlcool;

    public BoissonAlcoolisee(String nom, int contenance, double prix, double degreDAlcool) {
        super(nom, contenance, prix);
        this.degreDAlcool = degreDAlcool;
    }

    public double getDegreDAlcool() {
        return degreDAlcool;
    }

    @Override
    public String toString() {
        return super.toString()+ " (degré d'alcool : "+ degreDAlcool +"°)";
    }
}
