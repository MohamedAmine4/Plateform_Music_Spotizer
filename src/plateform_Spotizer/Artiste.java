package plateform_Spotizer;

import java.util.ArrayList;
import java.util.List;

public class Artiste {

	private String nom;
	
	private List<Album> Albums;
	private ArrayList<TitreMusic> music =new ArrayList<>();
	private double solde;

	public Artiste(String nom) {
		super();
		this.nom = nom;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public List<Album> getAlbums() {
		return Albums;
	}

	public void setAlbums(List<Album> albums) {
		Albums = albums;
	}
	 
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde  += solde;
	}

	public TitreMusic CreerMusic(String titre, Artiste artiste, String style, double tempo, double duree,
			String visuelUrl, String statut) {
		TitreMusic T= new TitreMusic( titre,  artiste,    style,  tempo,  duree,
				 visuelUrl,  statut);
		
		return T;
	}
	public void ajouterMusic(TitreMusic c) {
		music.add(c);
	}
	public Album creerAlbum(String nom, Artiste artiste, String visuelUrl) {
		Album T= new Album(  nom,  artiste,  visuelUrl);
		Albums.add(T);
		return T;
	}
	
	 public void ajouterAlbum(Album albu) {
		 Albums.add(albu);
	    }
	 public void ChangeStatut(String Statut,TitreMusic t) {
		 t.setStatut(Statut);
	 }
		
	 
}
