public class DuelGuerriers_VI {

    public static void main(String[] args) {

        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers();
        jeu.afficherInformation("A CogneDur");
        int pointsDeVieCogneDur = jeu.lancerDe();
        jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);

        jeu.afficherInformation("A FrappeFort");
        int pointsDeVieFrappeFort = jeu.lancerDe();
        jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);


        int degats = jeu.lancerDe();

        jeu.afficherEpee(1);
        jeu.afficherBouclier(2);
        jeu.afficherInformation("A CogneDur");


        if((pointsDeVieFrappeFort-degats)<=0) {
            jeu.afficherCroix(2);
            jeu.afficherCoupeOr(1);
            jeu.afficherInformation("Fin du jeu");
        }
        else {
            pointsDeVieFrappeFort -= degats;
            jeu.afficherPointsDeVie(2,pointsDeVieFrappeFort);
            degats = jeu.lancerDe();
            jeu.afficherBouclier(1);
            jeu.afficherEpee(2);
            jeu.afficherInformation("A FrappeFort");



            if ((pointsDeVieCogneDur-degats)<=0) {

                jeu.afficherCroix(1);
                jeu.afficherCoupeOr(2);
                jeu.afficherInformation("Fin du jeu");

            }
            else {
                pointsDeVieCogneDur -= degats;
                jeu.afficherPointsDeVie(1,pointsDeVieCogneDur);




                if  (pointsDeVieFrappeFort > pointsDeVieCogneDur) {
                    jeu.afficherCoupeOr(2);
                    jeu.afficherCoupeArgent(1);
                    jeu.afficherInformation("Fin du jeu");
                }

                else {

                    jeu.afficherCoupeOr(1);
                    jeu.afficherCoupeArgent(2);
                    jeu.afficherInformation("Fin du jeu");

                    if(pointsDeVieFrappeFort == pointsDeVieCogneDur) {
                        jeu.afficherCoupeOr(1);
                        jeu.afficherCoupeOr(2);
                        jeu.afficherInformation("Fin du jeu");
                    }


                }

            }



        }

    }






}
