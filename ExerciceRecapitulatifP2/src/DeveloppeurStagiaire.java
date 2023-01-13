public class DeveloppeurStagiaire extends Developpeur {
    private String ecole;

    public DeveloppeurStagiaire(String nom, String specialite,double salaire ,  String ecole) {
        super(nom, specialite,100);

        this.ecole = ecole;

    }

    public String getEcole() {
        return ecole;
    }

    @Override
    public String toString() {
        return "Stagiaire " + super.toString() +
                ", Ecole : " + ecole;
    }

}
