/**
 * 
 */
package fr.orsys.bibliotheque.inventaire;

/**
 * @author Administrateur
 *
 */
public class Exemplaire {
	
	private String reference;
	private EtatExemplaire etat;
	
	public Exemplaire() {
	}

	/**
	 * @param reference
	 * @param etat
	 */
	public Exemplaire(String reference, EtatExemplaire etat) {
		this.reference = reference;
		this.etat = etat;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @return the etat
	 */
	public EtatExemplaire getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(EtatExemplaire etat) {
		this.etat = etat;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result
				+ ((reference == null) ? 0 : reference.hashCode());
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
		if (!(obj instanceof Exemplaire))
			return false;
		Exemplaire other = (Exemplaire) obj;
		if (etat == null) {
			if (other.etat != null)
				return false;
		} else if (!etat.equals(other.etat))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exemplaire [reference=" + reference + ", etat=" + etat + "]";
	}

}
