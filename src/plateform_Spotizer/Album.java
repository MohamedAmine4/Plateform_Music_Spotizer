package plateform_Spotizer;

import java.util.List;

public class Album {

	private String nom;
	private Artiste artiste;
	private String visuelUrl;
	private List<TitreMusic> titres;
	
	public Album(String nom, Artiste artiste, String visuelUrl) {
		super();
		this.nom = nom;
		this.artiste = artiste;
		this.visuelUrl = visuelUrl;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Artiste getArtiste() {
		return artiste;
	}
	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}
	public String getVisuelUrl() {
		return visuelUrl;
	}
	public void setVisuelUrl(String visuelUrl) {
		this.visuelUrl = visuelUrl;
	}
	public void AjouterAlbumMusic(TitreMusic t) {
		titres.add(t);
	}
	
}
