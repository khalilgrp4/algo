public class CalculMoyenne {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        // la chaine de caracteres se met entre""(string)
        // Le caractere se met entre ''(char)
        char reponse = 'Y';
        

        // Pour lire un caractere :
        // (next() --> lecture d'une chaine de caracteres)
        //(charAt(0) --> 1er caractere de la chaine de caracteres

        double somme_total = 0;
        int compteur = 0;


        do {
            System.out.print("Entrez votre cote : ");
            int cote = scanner.nextInt();
            somme_total += cote;
            compteur ++;
            System.out.print("Encore une cote ? ");
            reponse = scanner.next().charAt(0);





        }while (reponse == 'Y' || reponse == 'y' || reponse == 'O' || reponse == 'o');

        double moyenne = somme_total/compteur;
        System.out.println("La moyenne est : "+moyenne);

        //poser la question pour la ligne 17 et 26 pk ne pas la mettre à la ligne 31


    }


}
