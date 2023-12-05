public class CalculBMI {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("La taille : ");
        double taille = scanner.nextDouble();
        System.out.print("le poids : ");
        int poids = scanner.nextInt();

        double bmi = poids/(taille*taille);

        if ((bmi <25) && (bmi > 20)){
            System.out.println("Vous êtes normal");
        }
        else {
            if (bmi < 20) {
                System.out.println("Vous êtes mince");
            }
            else {
                if (bmi > 25) {
                    System.out.println("Vous êtes en embonpoint");
                }
                else {
                    System.out.println("Vous êtes obèse");
                }
            }
        }





    }
}
