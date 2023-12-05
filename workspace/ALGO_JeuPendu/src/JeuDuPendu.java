
public class JeuDuPendu {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Entrez le mot a trouver : ");

		String motATrouver = scanner.next().toUpperCase();

		FenetrePendu fenetrePendu = new FenetrePendu();
		fenetrePendu.afficherPendu(0);

		MotACompleter mot = new MotACompleter(motATrouver);

		//Pour amelioration 1 :
		//LettresLues lettreslues = new LettresLues();

		fenetrePendu.afficherMot(mot.toString());

		char lettre = Character.toUpperCase(fenetrePendu.lireLettre());
	}

}
