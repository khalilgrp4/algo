public class CoteCommentee {

    public static java.util.Scanner scanner =  new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez votre cote : ");
        double cote = scanner.nextDouble();

        if(cote < 10){
            System.out.println("l'étudiant n'a pas validé l'UE.");

        }
        if((cote >= 10) && (cote<14)) {
            System.out.println("l'étudiant a validé l'UE.");

        }
        if ((cote >= 14) &&(cote<16)) {
            System.out.println("l'étudiant a validé l'UE avec une belle cote.");
        }
        if (cote >= 16) {
            System.out.println("l'étudiant a validé l'UE avec une très belle cote.");
        }

    }
}
