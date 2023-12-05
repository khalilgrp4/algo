public class Utilitaires {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    /**
     * genere un entier compris entre les 2 valeurs passees en parametre
     * @param valeurMinimale la valeur minimale de l'entier genere
     * @param valeurMaximale la valeur maximale de l'entier genere
     * @return l'entier genere
     */
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }



    /**
     * lit un nombre reel positif ou nul
     * @return un nombre reel positif
     */
    public static double lireReelPositif(){
        double x = scanner.nextDouble();
        while(x < 0){
            System.out.println("Attention le reel doit etre positif");
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();
        }
        return x;
    }


    /**
     * lit un nombre reel compris entre les 2 valeurs passees en parametre
     * @param min le plus petit reel accepte
     * @param max le plus grand reel accepte
     * @return un nombre reel compris entre 2 bornes
     */
    public static double lireReelComprisEntre(double min, double max ){
        double nombre = scanner.nextDouble();
        while (nombre<min||nombre>max){
            nombre = scanner.nextDouble();
        }
        return nombre;
        // TODO
        //il faut placer une boucle dans cette methode !
        //procedez comme pour la methode lireReelEntierPositif() donnee ci-dessus
    }


    /**
     * lit le caractere o ou n
     * @return le caractere o un n
     */
    public static char lireOouN(){
        char lettre = scanner.next().charAt(0);
        while (lettre != 'o' && lettre != 'n'){
            lettre = scanner.next().charAt(0);
        }
        return lettre;


        // TODO
        //il faut placer une boucle dans cette methode !
    }

    public static int lireEntierNonNul(){
        int entier = scanner.nextInt();
        while (entier == 0){
            System.out.println("Attention, division par 0");
            entier = scanner.nextInt();
        }
        return entier;
    }

    public static int lireEntierPositif(){
        int entier = scanner.nextInt();
        while (entier<0){
            System.out.println("Attention, ce chiffre est négatif ou nul.");
            entier = scanner.nextInt();
        }
        return entier;
    }



}
