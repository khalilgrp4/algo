public class DessinPriseElectrique {
    public static void main(String[] args) {
        Tortue tortue = new Tortue();

        tortue.accelerer();

        for (int i = 0; i < 360; i++) {
            tortue.avancer(1);
            tortue.tournerADroite(1);

        }

        tortue.tournerADroite(90);
        tortue.avancer(1);

        tortue.definirCouleur("NOIR");
        tortue.avancer(50);
        tortue.tournerAGauche(90);
        tortue.avancer(20);
        tortue.definirCouleur("BLANC");

        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.1);
            tortue.tournerADroite(1);

        }

        tortue.tournerAGauche(180);
        tortue.avancer(5);
        tortue.definirCouleur("NOIR");
        tortue.avancer(35);
        tortue.definirCouleur("BLANC");

        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.1);
            tortue.tournerAGauche(1);

        }
    }
}
