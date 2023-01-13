public class Film extends ContenueVideo {

    private int duree;
    private long recette;

    public Film(String titre, String categorie, int duree, long recette) {
        super(titre, categorie);
        if (duree <= 0 || recette < 0)
            throw new IllegalArgumentException();
        this.duree = duree;
        this.recette = recette;
    }

    public Film(String titre, String categorie, int duree) {
        this(titre, categorie, duree, 0);

    }

    public void setDuree(int duree) {
        if (duree <= 0)
            throw new IllegalArgumentException();
        this.duree = duree;
    }

    public void setRecette(long recette) {
        if (recette < 0)
            throw new IllegalArgumentException();
        this.recette = recette;
    }

    @Override
    public String toString() {
        return "Film " + super.toString() +
                " duree=" + duree +
                ", recette=" + recette + "]";
    }
}
