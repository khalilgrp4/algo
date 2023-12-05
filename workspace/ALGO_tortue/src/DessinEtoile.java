public class DessinEtoile {

    public static void main(String[] args) {

        Tortue tortue = new Tortue();

        tortue.accelerer();

        tortue.definirCouleur("BLEU");

        for (int i = 0; i < 3; i++) {
            tortue.avancer(100);
            tortue.tournerAGauche(120);
        }

        tortue.tournerAGauche(90);
        tortue.avancer(1);
        tortue.definirCouleur("NOIR");
        tortue.avancer(60);
        tortue.tournerADroite(90);

        tortue.definirCouleur("ROUGE");

        for (int i = 0; i < 3; i++) {
            tortue.avancer(100);
            tortue.tournerADroite(120);

        }
    }
}
