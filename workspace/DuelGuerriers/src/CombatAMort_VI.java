public class CombatAMort_VI {

    public static void main(String[] args) {


        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers();
        jeu.afficherInformation("A CogneDur");
        int pointsDeVieCogneDur = 9;
        jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);

        jeu.afficherInformation("A FrappeFort");
        int pointsDeVieFrappeFort = 12;
        jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);


        int degats = jeu.lancerDe();

        jeu.afficherEpee(1);
        jeu.afficherBouclier(2);
        jeu.afficherInformation("A CogneDur");


    }
}
