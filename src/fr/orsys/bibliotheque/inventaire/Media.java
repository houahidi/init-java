/**
 * 
 */
package fr.orsys.bibliotheque.inventaire;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * Représente les médias de la bibliotheque
 * 
 * @author Administrateur
 * 
 */
public abstract  class Media {
	
	private long id;
	private String titre;
	private String auteur;
	private Date datePublication;
	private List<Exemplaire> exemplaires;
	
	/**
	 * constructeur par défaut
	 */
	public Media() {
		this.exemplaires = new ArrayList<Exemplaire>();
		
	}
	/**
	 * Constructeur avec paramètres
	 * 
	 * @param id
	 * 	identifiant du media
	 * @param titre
	 * le titre du media
	 * @param auteur
	 * l'auteur 
	 * @param datePublication
	 * date publication
	 */
	public Media(long id, String titre, String auteur, Date datePublication) {
		this();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.datePublication = datePublication;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}
	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	/**
	 * @return the datePublication
	 */
	public Date getDatePublication() {
		return datePublication;
	}
	/**
	 * @param datePublication the datePublication to set
	 */
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	
	
	public void addExemplaire(Exemplaire e) throws DuplicatedExemplaireException{
		if( exemplaires != null && ! exemplaires.contains(e))
				exemplaires.add(e);
		else
			throw new DuplicatedExemplaireException();
	}


	
	public void removeExemplaire(Exemplaire e){
		if(  exemplaires != null && exemplaires.contains(e))
				exemplaires.remove(e);
	}
	/**
	 * @return the exemplaires
	 */
	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	/**
	 * @param exemplaires the exemplaires to set
	 */
	public void setExemplaires(List<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		int result = (int) id ;
		result =  result + ((titre == null) ? 0 : titre.hashCode());
		System.out.println(">>>>>>>>>>>hashCode>>"+result);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Media))
			return false;
		Media other = (Media) obj;
		if (id != other.id)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Media [id=" + id + ", titre=" + titre + "]";
	}
	
	
	

}
