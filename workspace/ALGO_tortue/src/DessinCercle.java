public class DessinCercle {
    public static void main(String[] args) {
        Tortue tortue = new Tortue();

        tortue.accelerer();

        for (int i = 0; i < 360; i++) {  // cercle du bas
            tortue.avancer(1);
            tortue.tournerADroite(1);

        }
        for (int i = 0; i < 360; i++) {  // cercle du haut
            tortue.avancer(0.5);   // on a besoin de plus petit pixel pour faire un plus petit cercle
            tortue.tournerAGauche(1);

        }
        for (int i = 0; i < 180 ; i++) { // sachant que la tortue diriger vers le bas du cercle, faut parvenir vers le haut afin de passer au chapeau
            tortue.avancer(0.5);
            tortue.tournerAGauche(1);

        }


        tortue.avancer(25);  // chapeau du bonhomme
        tortue.tournerADroite(180);
        tortue.avancer(50);
        for (int i = 0; i < 2; i++) {
            tortue.tournerAGauche(120);
            tortue.avancer(50);

        }

        tortue.tournerAGauche(120);  // parvenir à l'oeil gauche
        tortue.avancer(25);
        tortue.tournerADroite(90);
        tortue.definirCouleur("NOIR");
        tortue.avancer(25);
        tortue.tournerADroite(90);
        tortue.avancer(12);

        for (int i = 0; i < 360; i++) {    // on fait l'oeil gauche
            tortue.definirCouleur("BLANC");
            tortue.avancer(0.1);
            tortue.tournerAGauche(1);
        }

        tortue.tournerADroite(180);   // parvenir à l'oeil droit
        tortue.avancer(3); //laisser d'espace à ma tortue afin de ne pas avoir de trait noir sur l'oeil gauche
        tortue.definirCouleur("NOIR");
        tortue.avancer(20);

        for (int i = 0; i < 360; i++) {   // on fait l'oeil droit
            tortue.definirCouleur("BLANC");
            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

    }

}
