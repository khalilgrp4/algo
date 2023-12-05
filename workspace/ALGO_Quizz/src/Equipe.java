
public class Equipe {
	
	private int numeroEquipe; // 1 ou 2
	private Candidat[] tableCandidats;  
	private int nombreCandidats; // le nombre de candidats encore en jeu
	

	// A NE PAS MODIFIER
	public Equipe(int numero, Candidat[] tableCandidats) {
		if(numero!=1&& numero!=2)
			throw new IllegalArgumentException();
		if(tableCandidats==null)
			throw new IllegalArgumentException();
		this.numeroEquipe=numero;
		this.nombreCandidats = tableCandidats.length;
		this.tableCandidats = new Candidat[tableCandidats.length];
		for (int i = 0; i < tableCandidats.length; i++) {
			this.tableCandidats[i]=tableCandidats[i];
		}
	}

			
	public int getNombreCandidats() {
		return nombreCandidats;
	}	

	public int getNumero() {
		return numeroEquipe;
	}

	/**
	 * renvoie le premier candidat de la table et le retire de celle-ci
	 * le deuxieme candidat prend sa place, le troisieme prend la place du deuxieme et ainsi de suite
	 * @return le candidat qui vient d'etre supprime ou null si la table ne contient plus de candidat
	 */
	public Candidat selectionnerCandidat(){
		if (nombreCandidats == 0)
			return null;

		Candidat candidatsupp = tableCandidats[0];
		for (int i = 0; i < nombreCandidats-1; i++) {
			tableCandidats[i] = tableCandidats[i+1];
		}
		nombreCandidats --;
		return candidatsupp;
	}
	
	/**
	 * met le candidat apres le dernier candidat encore present
	 * la table ne peut etre pleine
	 * @param candidat le candidat a ajouter
	 * @return true si le candidat a ete ajoute, false sinon
	 * @throws IllegalArgumentException si le candidat est null
	 */
	
	public boolean remettreEnJeu(Candidat candidat){
		if(candidat==null)
			throw new IllegalArgumentException();
		if (nombreCandidats< tableCandidats.length) {
			tableCandidats[nombreCandidats] = candidat;
			nombreCandidats ++;
			return true;
		}
		return false;


	}
	
	/**
	 * cree une table des candidats encore en jeu
	 * la taille physique de la table renvoyee doit etre egale a la taille logique
	 * @return la table creee
	 */
	public Candidat[] candidatsEnjeu(){
		Candidat[] candidats = new Candidat[nombreCandidats];

		for (int i = 0; i <candidats.length; i++) {
			candidats[i]=tableCandidats[i];
		}
		return candidats;

	}	
	
	//A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	public String toString(){
		String aRenvoyer ="";
		for (int i = 0; i < nombreCandidats; i++) {
			aRenvoyer = aRenvoyer+" "+tableCandidats[i].getNom();
		}	
		return aRenvoyer;
	}

	// A NE PAS MODIFIER
	// VA SERVIR POUR LA CLASSE TEST
	public Equipe(int numero, Candidat[] tableCandidats,int nombreCandidats) {
		if(numero!=1&& numero!=2)
			throw new IllegalArgumentException();
		if(tableCandidats==null)
			throw new IllegalArgumentException();
		if(nombreCandidats<0||nombreCandidats> tableCandidats.length)
			throw new IllegalArgumentException();
		this.numeroEquipe=numero;
		this.nombreCandidats = nombreCandidats;
		this.tableCandidats = new Candidat[tableCandidats.length];
		for (int i = 0; i < tableCandidats.length; i++) {
			this.tableCandidats[i]=tableCandidats[i];
		}
	}

}
