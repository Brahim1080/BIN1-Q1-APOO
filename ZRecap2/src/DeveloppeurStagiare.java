public class DeveloppeurStagiare extends Developpeur {
    private String ecole;
    public DeveloppeurStagiare(String nom, String specialite, double salaire, String ecole) {
        super(nom, specialite, 100);
        this.ecole = ecole;
    }

    public String getEcole() {
        return ecole;
    }

    @Override
    public String toString() {
        return "Stagiere " + super.toString()+
                "ecole=" + ecole;
    }
}
