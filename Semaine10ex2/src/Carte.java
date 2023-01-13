import java.util.Objects;

public class Carte {

    private int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return cout == carte.cout;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cout);
    }

    public  String fournirDetails() {
        return "cout : " +cout;
    }
}
