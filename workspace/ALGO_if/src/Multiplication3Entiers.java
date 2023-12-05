public class Multiplication3Entiers {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int nombre1 = unEntierAuHasardEntre (0, 10);
        int nombre2 = unEntierAuHasardEntre (0, 10);
        int nombre3 = unEntierAuHasardEntre (0, 10);
        System.out.print(nombre1 + " x " + nombre2 + " x " + nombre3 + " = ");
        int produit = scanner.nextInt();

        if (produit != (nombre1*nombre2*nombre3)) {
            System.out.println("La bonne réponse était : " + (nombre1*nombre2*nombre3));

        }
        else {
            System.out.println("Bravo !");
        }





    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
    }

}
