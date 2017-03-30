/**
 * 
 */
package fr.orsys.bibliotheque.exemples;



/**
 * @author Administrateur
 * @since 1.0
 * @version 1.6
 *
 */

public class ClassePrincipale {
	
	 int nombre = 10;
	 
	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO implementer la méthode main
		System.out.println("Mon premier programme Java");
		int resulat = Math.abs(-10);
		System.out.println(resulat); 
		
		String chaine = "ma chaine de caractères";
		//String chaine = new String("ma chaine de caractères");
		System.out.println("chaine :"+chaine);
		
		resulat /= 4; // resultat = resultat / 4;
		int i = 0;
		i++; // i+=1; // i = i + 1;
		//operateur ternaire
		int j = i > 0 ? i : 0;
		System.out.println("j :"+j);
		if(args.length == 2)
				System.out.println("3ème parametre du programme : "+args[2]);
		
	
		ClassePrincipale instance = new ClassePrincipale();
		System.out.println(instance.toString());
		
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nombre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		if (!(obj instanceof ClassePrincipale))
			return false;
		
		
		
		ClassePrincipale other = (ClassePrincipale) obj;
		if (nombre != other.nombre)
			return false;
		return true;
	}
	
	

}
