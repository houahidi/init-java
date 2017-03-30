package fr.orsys.bibliotheque.inventaire;


import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InventaireMain {

	public static void main(String[] args) {
		System.out.println("Creer une première instance de la categorie");
		Categorie cat1 = new Categorie();
		System.out.println(cat1);
		cat1.setId(1);
		cat1.setLibelle("Informatique");
		System.out.println(cat1);
		System.out.println("Creer une deuxieme instance de la categorie");
		Categorie cat2 = new Categorie();
		System.out.println(cat2);
		cat2.setId(2);
		cat2.setLibelle("Art");
		System.out.println(cat1);
		System.out.println("comparer cat1 == cat2");
		boolean r = cat1.equals(cat2);
		System.out.println(r);
		Categorie cat3 = new Categorie(1,"Informatique");
		System.out.println(cat3);
		//cat3.setId(1);
		//cat3.setLibelle("Informatique");
		//System.out.println(cat3);
		System.out.println("comparer cat1 == cat3");
		r = cat1.equals(cat3);
		System.out.println(r);
		//Test media - constructeur par défaut
		Media m1 = new Livre();
		System.out.println(m1);
		m1.setId(1);
		m1.setTitre("Java SE");
		m1.setAuteur("Orsys");
		m1.setDatePublication( new Date());
		System.out.println(m1);
		//Test media - constructeur avec parametre
		Media m2 = new Livre(2,"UML","Orsys",new Date(),"43434-43",434);
		System.out.println(m2);
		System.out.println("m2 - Auteur :"+ m2.getAuteur());
		System.out.println("m2 - Date :"+ m2.getDatePublication());
		//cast to Livre
		System.out.println("m2 - isbn :"+ ((Livre)m2).getIsbn());
		//Test Exemplaire
		Exemplaire e1 = new Exemplaire("ref1", EtatExemplaire.Disponible);
		System.out.println(e1);
		e1.setEtat(EtatExemplaire.Reserve);
		System.out.println(e1);
		//Création d'une liste de medias
		System.out.println("Création d'une liste de medias");
		List<Media> medias = new LinkedList<Media>();
		medias.add(m1);
		medias.add(m2);
		medias.add(m1);
		medias.add(m2);
		System.out.println("Afficher les éléments de medias ");
		for(int i = 0 ; i < medias.size(); i++ ){
			Media m = medias.get(i);			
			System.out.println("media "+ i + " : "+m);
		}
		//foreach
		for(Media m : medias){
			System.out.println("media : "+m);
		}
		//Création d'une liste de medias sans doublons
		System.out.println("Création un ensemble de medias");
		Set<Media> mediasSet = new HashSet<Media>();
		mediasSet.add(m1);
		mediasSet.add(m2);
		mediasSet.add(m1);
		mediasSet.add(m2);
		System.out.println("Afficher les éléments de medias ");
		//foreach
		for(Media m : mediasSet){
			System.out.println("media : "+m);
		}
		//Création d'une map
		Map<Long,Media> map = new HashMap<Long, Media>();
		map.put(m1.getId(), m1);
		map.put(m2.getId(), m2);
		map.put(m1.getId(), m1);
		long key = m1.getId();
		//recuperer un element de la map à partir de la cle
		//plutot que parcourir l'ensemble
		System.out.println("media key :"+ key+ " : "+ map.get(key));
		System.out.println(m1);
		//Associer l'exemplaire e1 au media m1
		System.out.println("Associer l'exemplaire e1 au media m1");
		//m1.getExemplaires().add(e1);
		try {
			m1.addExemplaire(e1);
			//m1.addExemplaire(e1);
		} catch (DuplicatedExemplaireException e2) {
			//e2.printStackTrace();
			System.out.println(e2);
		}
		
		System.out.println("afficher les exemplaires de m1");
		//foreach
		for(Exemplaire e : m1.getExemplaires()){
			System.out.println("exemplaire : "+e);
		}
		System.out.println("dessocier l'exemplaire e1 au media m1");
		//m1.getExemplaires().add(e1);
		m1.removeExemplaire(e1);
		System.out.println("afficher les exemplaires de m1");
		//foreach
		for(Exemplaire e : m1.getExemplaires()){
			System.out.println("exemplaire : "+e);
		}
	}
}
