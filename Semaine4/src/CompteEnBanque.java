public class CompteEnBanque {
        private Personne titulaire;
        private Date dateValidite, dateOuverture;
        private double solde;
        private String numero;

        public CompteEnBanque(Personne nTitulaire, Date nDateValidite, Date nDateOuverture, double nSolde, String nNumero) {
            titulaire = nTitulaire;
            dateValidite = nDateValidite;
            dateOuverture = nDateOuverture;
            solde = nSolde;
            numero = nNumero;
        }

        // GETTER
        public Personne getTitulaire() {
            return titulaire;
        }

        public Date getDateValidite() {
            return dateValidite;
        }

        public Date getDateOuverture() {
            return dateOuverture;
        }

        public double getSolde() {
            return solde;
        }

        public String getNumero() {
            return numero;
        }

        //    SETTER
        public void setDateValidite(Date nDateValidite) {
            dateValidite = nDateValidite;
        }

        //    METHODE
        public boolean retirer(double montant) {
            if (montant <= 0 || solde < montant) return false;
            solde -= montant;
            return true;
        }

        public boolean deposer(double montant) {
            if (montant <= 0) return false;
            solde += montant;
            return true;
        }

        public boolean effectuerVirement(double montant, CompteEnBanque compteReceveur) {
            if (montant <= 0) return false;
            if (solde < montant) return false;

            solde -= montant;
            compteReceveur.solde = compteReceveur.solde + montant;
            return true;

        }

        public String toString() {
            return"Le solde de "+ getTitulaire()+ " est de " + getSolde()+ " €";
        }

    }


