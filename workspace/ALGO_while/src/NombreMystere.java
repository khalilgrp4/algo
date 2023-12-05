public class NombreMystere {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int nombreMystere = unEntierAuHasardEntre (0, 100);
        System.out.print("Veuillez entrer un nombre : ");
        int nombreUtilisateur = scanner.nextInt();
        int nombreEssais = 1;


        while (nombreUtilisateur!=nombreMystere){
            nombreEssais ++;
            if (nombreUtilisateur<nombreMystere){
                System.out.println("Ce nombre est plus petit que le nombre mystère.");
            }
            else {
                System.out.println("Ce nombre est plus grand que le nombre mystère.");
            }
            System.out.print("Veuillez entrer un nombre : ");
            nombreUtilisateur = scanner.nextInt();
        }
        System.out.println("Il t'a fallu "+ nombreEssais+" essais pour trouver le nombre mystère.");

    }


    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }
}
