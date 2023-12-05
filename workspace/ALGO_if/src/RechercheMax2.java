public class RechercheMax2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("L'entier 1 est : ");
        int entier1 = scanner.nextInt();
        System.out.print("L'entier 2 est : ");
        int entier2 = scanner.nextInt();

        if(entier1 > entier2) {
            System.out.println("L'élément le plus grand est : " + entier1);
        }
        else {
            System.out.println("L'élément le plus grand est : " + entier2);
        }

    }



}
