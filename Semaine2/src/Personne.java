public class Personne {

    private String nom, prenom;
    private  Date naissance;
    private  Adresse domicile;


    public Personne (String nNom , String nPrenom, Date nNaissance, Adresse nDomicile ){

        nom = nNom ;
        prenom = nPrenom ;
        naissance = nNaissance;
        domicile = nDomicile;
    }

    int calculerAge() {
        return 2021 - naissance.getAnnee();
    }

    int calculerAgeEn(int an) {
        return an - naissance.getAnnee();
    }

    public Adresse getDomicile() {
        return domicile;
    }

    public Date getDateNaissance(){
        return naissance;
    }


    public String toString(){

        return prenom + " " + nom + " ne le " + naissance;
    }

    public void demenager(String rue, String numero , String codePostal, String ville) {
        //creer une nouvelle Adresse avec les param
        Adresse adresse= new Adresse(rue, numero,codePostal,ville );
        //changer le domicile avec la nouvelle Adresse
        domicile = adresse;
    }




}
