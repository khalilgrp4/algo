public class Multiplication{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Entrainement aux multiplications. Voici un exercice :");
		
		int nombre1 = unEntierAuHasardEntre (0, 10);
		int nombre2 = unEntierAuHasardEntre (0, 10);

		System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
		int produit = scanner.nextInt();

		if ( produit != (nombre1*nombre2)) {
			System.out.println("La bonne réponse était : " + (nombre1*nombre2));
		}
		else {
			System.out.println("Bravo !");
		}
		

	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
	}
}