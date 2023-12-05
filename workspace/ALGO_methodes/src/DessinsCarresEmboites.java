public class DessinsCarresEmboites {

    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        tortue.accelerer();
        double deplacement = 100;
        for (int i = 0; i < 5; i++) {
            tortue.dessinerUnCarre(deplacement);
            deplacement-=10;
            tortue.dessinerUnCarre(deplacement);

        }
    }
}
