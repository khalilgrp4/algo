public class CalculSomme {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double totalCotes = 0;

        char reponse = 'Y';


        while (reponse == 'Y') {

            System.out.print("Entrez une cote (sur 20) : ");
            double cote = scanner.nextDouble();

            System.out.println("Encore une cote (Y/N) ? ");
            reponse = scanner.next().charAt(0);
            totalCotes += cote;





        }
        System.out.println(totalCotes);
    }
}

