public class DessinCarresEmboites {
    public static Tortue tortue = new Tortue();


    public static void main(String[] args) {

        tortue.accelerer();

        int deplacement = 100;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                tortue.avancer(deplacement);
                tortue.tournerADroite(90);
            }
            deplacement -= 10;

        }
    }


}
