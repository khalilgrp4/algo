public class DessinLunettes {
    public static void main(String[] args) {
        Tortue tortue = new Tortue();

        for (int i = 0; i < 4; i++) {
            tortue.avancer(50);
            tortue.tournerADroite(90);

        }
        tortue.avancer(75);

        for (int i = 0; i < 4; i++) {
            tortue.avancer(50);
            tortue.tournerADroite(90);

        }

    }
}
