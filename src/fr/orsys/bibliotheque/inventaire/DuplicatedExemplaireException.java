package fr.orsys.bibliotheque.inventaire;

public class DuplicatedExemplaireException extends Exception {
	
	public DuplicatedExemplaireException() {
		super(" l'exemplaire est duplique");
	}

}
