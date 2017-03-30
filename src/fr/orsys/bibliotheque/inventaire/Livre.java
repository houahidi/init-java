/**
 * 
 */
package fr.orsys.bibliotheque.inventaire;

import java.util.Date;

/**
 * @author Administrateur
 *
 */
public class Livre extends Media {
	
	private String isbn;
	private int pages;
	
	public Livre() {
		super();
	}

	/**
	 * @param id
	 * @param titre
	 * @param auteur
	 * @param datePublication
	 * @param isbn
	 * @param pages
	 */
	public Livre(long id, String titre, String auteur, Date datePublication,
			String isbn, int pages) {
		super(id, titre, auteur, datePublication);
		this.isbn = isbn;
		this.pages = pages;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", pages=" + pages + ", Id="
				+ getId() + ", Titre=" + getTitre() + "]";
	}

	
	
	

}
