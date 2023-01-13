import java.util.Objects;

public class CarteJeu {

    private int cout;

    public CarteJeu(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarteJeu carteJeu = (CarteJeu) o;
        return cout == carteJeu.cout;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cout);
    }

    public  String fourirDetail() {
        return "cout : " +cout;
    }
}
