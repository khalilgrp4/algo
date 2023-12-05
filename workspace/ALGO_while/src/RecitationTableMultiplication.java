public class RecitationTableMultiplication {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombre = unEntierAuHasardEntre(0, 10);
        System.out.print("Tu vas donner la table de multiplication par "+nombre+" :");
        System.out.println("");
        int produit;
        int i= 0;
        do {
            i ++;
            System.out.print(i+" x "+nombre+" = ");
            produit = scanner.nextInt();




        }while (produit==i*nombre && i<10);
        if (i==10){
            System.out.println("Félicitation !");
        }
        if (produit != nombre*i){
            System.out.println("Non c'est faux, la bonne réponse est "+(nombre*i));
        }



    }


    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
    }
}
