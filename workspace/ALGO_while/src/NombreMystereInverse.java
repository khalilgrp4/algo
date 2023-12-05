public class NombreMystereInverse {


    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombreOrdinateur = unEntierAuHasardEntre (0, 100);

        char symboleEgale = '=';


        System.out.println("Le chiffre est bien : "+nombreOrdinateur+" ?");
        char symboleUtilisateur = scanner.next().charAt(0);

        while (symboleUtilisateur!= symboleEgale){
            if (symboleUtilisateur == '+'){
                nombreOrdinateur = unEntierAuHasardEntre(nombreOrdinateur+1,100);
                System.out.println("Le chiffre est bien "+nombreOrdinateur+" ?");
                symboleUtilisateur = scanner.next().charAt(0);
            }
            else {
                if (symboleUtilisateur == '-') {
                    nombreOrdinateur = unEntierAuHasardEntre(0, nombreOrdinateur - 1);
                    System.out.println("Le chiffre est bien " + nombreOrdinateur + " ?");
                    symboleUtilisateur = scanner.next().charAt(0);
                }
            }

        }

        System.out.println("C'est le bon nombre");





    }


    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }
}
