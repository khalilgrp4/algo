public class Dessins {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int choix;
		do {
			afficherMenu();
			System.out.print("\nEntrez votre choix : ");
			choix = scanner.nextInt();
			switch (choix) {
				case 1:
					carre();
					break;
				case 2:
					triangleVersion1();
					break;

				case 3:
					triangleVersion2();
					break;

				case 4:
					triangleVersion3();
					break;
				case 5:
					pyramide();
					break;
				case 6:
					losange();
					break;
			}
			System.out.println();
		}
		while (choix >= 1 && choix <= 2);
	}

	private static void afficherMenu() {
		System.out.println("*********");
		System.out.println("Dessins :");
		System.out.println("*********");
		System.out.println("1 -> carre");
		System.out.println("2 -> triangle version 1");
		System.out.println("3 ->,triangle version 2");
		System.out.println("4 -> triangle version 4");
		System.out.println("5 -> pyramide");
		System.out.println("6 -> losange");
		System.out.println("autre -> quitter");

	}

	private static void carre() {
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("X");
			}
			System.out.println("");

		}
	}

	private static void triangleVersion1() {
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		int nombreCroix = 0;


		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= nombreCroix; j++) {
				System.out.print("X");
			}
			nombreCroix++;
			System.out.println("");

		}
	}

	private static void triangleVersion2() {
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		int nombreCroix = n;


		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nombreCroix; j++) {
				System.out.print("X");
			}
			nombreCroix--;
			System.out.println("");


		}

	}

	private static void triangleVersion3() {
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		int nombreCroix = n;
		int nombreBlanc = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nombreBlanc ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= nombreCroix ; j++) {
				System.out.print("X");

			}
			System.out.println();
			nombreBlanc ++;
			nombreCroix --;

		}

	}


	public static void pyramide(){
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		int nombreBlanc = 3;
		int nombreCroix = 1;

		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <=nombreBlanc ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= nombreCroix ; j++) {
				System.out.print("X");
			}
			for (int j = 1; j <=nombreBlanc ; j++) {
				System.out.print(" ");
			}
			System.out.println("");
			nombreCroix += 2 ;
			nombreBlanc --;

		}

	}


	public static void losange(){
		System.out.print("\nEntrez n : ");
		int n = scanner.nextInt();
		int nombreCroix = n;
		int nombreBlanc = 0;
		for (int i = 1; i < n ; i++) {
			for (int j = 1; j <= (nombreCroix); j++) {
				System.out.print("X");
			}

			for (int j = 1; j <= nombreBlanc; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (nombreCroix); j++) {
				System.out.print("X");
			}
			System.out.println("");
			nombreCroix --;
			nombreBlanc +=2;



		}


		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= (nombreCroix); j++) {
				System.out.print("X");
			}

			for (int j = 1; j <= nombreBlanc; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (nombreCroix); j++) {
				System.out.print("X");
			}
			System.out.println("");
			nombreCroix ++;
			nombreBlanc -=2;



		}



	}

}
