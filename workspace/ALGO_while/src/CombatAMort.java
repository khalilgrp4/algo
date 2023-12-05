public class CombatAMort {

    public static void main(String[] args) {
        /*

        System.out.println("CogneDur inflige ? points de degats a FrappeFort.");
        System.out.println("FrappeFort inflige ? points de degats a CogneDur.");

        System.out.println("Il reste ? points de vie a FrappeFort.");
        System.out.println("Il reste ? points de vie a CogneDur.");

        System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
        System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");

        System.out.println("CogneDur est victorieux.");
        System.out.println("FrappeFort est victorieux.");
        */

        System.out.println("Bienvenue au combat entre CogneDur et FrappeFort !");
        System.out.println("");
        int pointsDeVieCogneDur = 9;
        int pointsDeVieFrappeFort = 12;


        do {
            int degats = lancerDe();
            System.out.println("CogneDur inflige "+degats+" points de degats a FrappeFort.");

            pointsDeVieFrappeFort -= degats;
            if (pointsDeVieFrappeFort>0)
                System.out.println("Il reste "+(pointsDeVieFrappeFort)+" points de vie a FrappeFort.");
            System.out.println("");

            degats = lancerDe();
            System.out.println("FrappeFort inflige "+degats+" points de degats a CogneDur.");

            pointsDeVieCogneDur -= degats;
            if (pointsDeVieCogneDur>0)
                System.out.println("Il reste "+(pointsDeVieCogneDur)+" points de vie a CogneDur.");
            System.out.println("");

        }while (pointsDeVieFrappeFort>0 && pointsDeVieCogneDur>0);

        if (pointsDeVieFrappeFort<0){
            System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");
            System.out.println("CogneDur est victorieux.");
        }
        else {
            System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
            System.out.println("FrappeFort est victorieux.");
        }






    }

    public static int lancerDe(){
        return (int)((Math.random() * 6) + 1);
    }
}
