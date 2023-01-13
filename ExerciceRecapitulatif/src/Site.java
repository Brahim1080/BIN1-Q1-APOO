import java.util.ArrayList;

public class Site {

    private String url;
    private ArrayList<ContenueVideo> contenueVideos;

    public Site(String url) {
        if (url == null || url.equals(""))
            throw new IllegalArgumentException();
        this.url = url;
        contenueVideos = new ArrayList<>();

    }

    public boolean ajouter(ContenueVideo cv) {
        if (cv == null)
            throw new IllegalArgumentException();
        if (contenueVideos.contains(cv))
            return false;

        return contenueVideos.add(cv);
    }

    public boolean Effacer(ContenueVideo cv) {
        if (cv == null)
            throw new IllegalArgumentException();

        if (contenueVideos.contains(cv)) {
            return contenueVideos.remove(cv);
        }
        return false;

    }

    @Override
    public String toString() {

        String texte = "Site [" + "url=" + url + "]" +
                "\nListe contenus videos";

        if (contenueVideos.isEmpty()) {
            texte += "\n Aucune video";
        } else {
            for (ContenueVideo contenueVideo : contenueVideos) {
                texte += "\n " + contenueVideo;
            }


        }

        return texte;
    }
}
