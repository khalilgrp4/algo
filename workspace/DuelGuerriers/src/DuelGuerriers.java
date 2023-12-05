public class DuelGuerriers {

	public static void main(String[] args) {

		int pointsDeVieCogneDur = lancerDe();
		System.out.println("CogneDur a "+pointsDeVieCogneDur+" points de vie");

		int pointsDeVieFrappeFort = lancerDe();
		System.out.println("FrappeFort a "+ pointsDeVieFrappeFort + " points de vie");

		int degats = lancerDe();

		System.out.println("CogneDur inflige "+ degats+" points de degats a FrappeFort.");


		if((pointsDeVieFrappeFort-degats)<=0) {
			System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");
			System.out.println("CogneDur remporte une coupe en or");
		}
		else {
			pointsDeVieFrappeFort -= degats;
			System.out.println("FrappeFort a "+pointsDeVieFrappeFort+" points de vie");
			degats = lancerDe();
			System.out.println("FrappeFort inflige "+degats+" points de degats a CogneDur.");

			if ((pointsDeVieCogneDur-degats)<=0) {

				System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
				System.out.println("FrappeFort remporte une coupe en or");

			}
			else {
				pointsDeVieCogneDur -= degats;
				System.out.println("CogneDur a "+pointsDeVieCogneDur+" points de vie");



				if  (pointsDeVieFrappeFort > pointsDeVieCogneDur) {
					System.out.println("FrappeFort remporte une coupe en or.");
					System.out.println("CogneDur remporte une coupe en argent.");
				}

				else {

					System.out.println("CogneDur remporte une coupe en or.");
					System.out.println("FrappeFort remporte une coupe en argent.");

					if(pointsDeVieFrappeFort == pointsDeVieCogneDur) {
						System.out.println("CogneDur et FrappeFort remportent une coupe en or.");
					}


				}

			}



		}

	}
















	public static int lancerDe(){
		return (int)((Math.random() * 6) + 1);
	}
}
