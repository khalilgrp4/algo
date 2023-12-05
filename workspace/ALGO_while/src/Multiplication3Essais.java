
public class Multiplication3Essais {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tu as droit a 3 essais");
		int premierNombre = unEntierAuHasardEntre (0, 10);
		int secondNombre = unEntierAuHasardEntre (0, 10);

		System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
		int produit = scanner.nextInt();
		int essais = 1;
		while(produit != premierNombre*secondNombre && essais < 3){
			essais ++;
			System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			produit = scanner.nextInt();
		}
		if (produit == premierNombre*secondNombre){
			System.out.println("C'est juste !");
		}
		else {
			System.out.println("le produit était "+(premierNombre*secondNombre));

		}




	}



	// A NE PAS MODIFIER
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
	}
	
}
