package fr.orsys.bibliotheque.inventaire;

/**
 * Représente la catégorie des médias de la bibliothèque
 * 
 * @author Administrateur
 *
 */
public class Categorie {
	
	//Attributs
	private int id ;
	private String libelle;
	
	//Les constructeurs
	/**
	 * Constructeur par défaut
	 */
	public  Categorie() {
	}
	/**
	 * Constructeur avec paramètres
	 * 
	 * @param id
	 * @param libelle
	 */
	public Categorie(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	//Les accesseurs
	/**
	 * 
	 * @return
	 * 
	 * l'identifiant
	 */
	public  int getId() {
		return this.id;
	}

	/**
	 * Modier l'id
	 * 
	 * @param id
	 * 
	 * Identifiant de la categorie
	 */
	public void setId(int id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Categorie))
			return false;
		Categorie other = (Categorie) obj;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}
	
	

}
