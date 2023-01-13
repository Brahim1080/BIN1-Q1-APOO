import java.util.Objects;

public class Cube implements Solide {

    private double cote;

    public Cube(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public double calculerVolume() {
        return cote * cote * cote;
    }

    @Override
    public double calculerSurface() {
        return cote * cote * 6 ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.cote, cote) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    @Override
    public String toString() {
        return "Cube de cote " +getCote() ;
    }
}
