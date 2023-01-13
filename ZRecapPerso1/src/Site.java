import java.util.ArrayList;

public class Site {

    private String url;
    private ArrayList<ContenuVideo> contenuVideos;

    public Site(String url) {
        this.url = url;
        contenuVideos = new ArrayList<>();
    }

    public boolean ajouter(ContenuVideo cv){
        if (contenuVideos.contains(cv))
            return false;

        return contenuVideos.add(cv);
    }

    public boolean effacer(ContenuVideo cv){
        if (!contenuVideos.contains(cv))
            return false;

        return contenuVideos.remove(cv);
    }

    @Override
    public String toString() {

        String texte = "Site[url=" + url + "]" + "\n Liste de contenus videos";

        if (contenuVideos.isEmpty()){
            return texte + "\n  Aucune videos";
        }else {
            for (ContenuVideo contenuVideo : contenuVideos) {
                texte += "\n  "  + contenuVideo.toString();
            }
        }


        return texte;
    }
}
