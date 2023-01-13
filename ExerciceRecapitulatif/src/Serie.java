public class Serie extends ContenueVideo {
    private int nombreEpisode;

    public Serie(String titre, String categorie, int nombreEpisode) {
        super(titre, categorie);
        if (nombreEpisode < 0)
            throw new IllegalArgumentException();
        this.nombreEpisode = nombreEpisode;
    }

    public void setNombreEpisode(int nombreEpisode) {
        if (nombreEpisode < 0)
            throw new IllegalArgumentException();
        this.nombreEpisode = nombreEpisode;
    }

    @Override
    public String toString() {
        return "Serie" + super.toString() +
                ", nombreEpisode=" + nombreEpisode + "]";
    }
}
