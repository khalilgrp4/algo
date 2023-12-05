public class Deliberation {
    public static void main(String[] args) {
        double totalMoyenneClasse = 0;
        for (int i = 1; i < 25; i++){
            totalMoyenneClasse += moyenneEtudiant();
        }
        System.out.println("La cote moyenne de la classe est "+(totalMoyenneClasse/25));;
    }

    public static double moyenneEtudiant(){

        double totalCoteEtudiant = 0;

        for (int i = 1; i <= 10; i++) {
            double cote = Utilitaires.lireReelComprisEntre(0, 20);
            totalCoteEtudiant += cote;


        }
        return (totalCoteEtudiant/10);

    }
}
