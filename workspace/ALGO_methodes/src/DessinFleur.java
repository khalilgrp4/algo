public class DessinFleur {

    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        tortue.accelerer();


        for (int i = 0; i < 4; i++) {
            tortue.dessinerUnTriangle(-75);
            tortue.tournerAGauche(90);
        }
    }
}
