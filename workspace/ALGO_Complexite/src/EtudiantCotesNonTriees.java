public class EtudiantCotesNonTriees {
    private double[] tableCotes;  // table non triee - les cotes sont comprises entre 0 et 20
    private int matricule;

    /**
     * methode qui calcule la moyenne des cotes de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return moyenne des cotes de l'etudiant
     */
    public double moyenne() {
        double sommeCote = 0;
        int nombreCote = 0;
        for (int i = 0; i < tableCotes.length; i++) {
            sommeCote += tableCotes[i];
            nombreCote ++;
        }
        return sommeCote/nombreCote;
    }

    /**
     * methode qui recherche la plus petite cote de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return la plus petite cote de l'etudiant
     */
    public double min(){
        double plusPetiteCote = 1000;
        for (int i = 0; i < tableCotes.length; i++) {
            if (tableCotes[i]<plusPetiteCote){
                plusPetiteCote = tableCotes[i];
            }
        }
        return plusPetiteCote;
    }

    /**
     * methode qui recherche la cote la plus elevee de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return la cote la plus elevee de l'etudiant
     */
    public double max(){
        double plusGrandeCote = 0;
        for (int i = 0; i < tableCotes.length; i++) {
            if (tableCotes[i]>plusGrandeCote){
                plusGrandeCote = tableCotes[i];
            }
        }
        return plusGrandeCote;
    }

    /**
     * methode qui calcule le nombre d'echecs de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return nombre d'echecs (cote < 10) de l'etudiant
     */
    public int nombreEchecs(){
        int nombreEchecs = 0;
        for (int i = 0; i < tableCotes.length; i++) {
            if (tableCotes[i]<10){
                nombreEchecs ++;
            }
        }
       return nombreEchecs;
    }

    /**
     * methode qui verifie si l'etudiant n'a pas d'echec
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return true si l'eudiant n'a pas pas d'echec, false sinon
     */
    public boolean aucunEchec(){
        if (nombreEchecs() == 0){
            return true;
        }
        return false;
    }



    //A NE PAS MODIFIER
    //VA SERVIR POUR LES TESTS
    public EtudiantCotesNonTriees(int matricule, double[] tableARecopier){
        if(tableARecopier.length==0)
            throw new IllegalArgumentException();
        this.matricule = matricule;
        this.tableCotes = new double[tableARecopier.length];
        tableCotes[0] = tableARecopier[0];
        for(int i = 1; i < tableARecopier.length; i++) {
            tableCotes[i] = tableARecopier[i];
        }
    }


    public String toString(){
        String aRenvoyer = "\n matricule : " + this.matricule +"\n cotes : ";
        for(int i = 0; i < tableCotes.length; i++)
            aRenvoyer = aRenvoyer + "  " + tableCotes[i];
        return aRenvoyer;
    }
}
