package plateform_Spotizer;

import java.util.ArrayList;

public class Compilation {

	private String nom;
    private ArrayList<TitreMusic> music;
    
    private Artiste artist;
    private Groupe groupe;
	public Compilation(String nom, Artiste artist, Groupe groupe) {
		super();
		this.nom = nom;
		this.music = new ArrayList<>();
		this.artist = artist;
		this.groupe = groupe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<TitreMusic> getMusic() {
		return music;
	}
	public void setMusic(ArrayList<TitreMusic> music) {
		this.music = music;
	}
	public Artiste getArtist() {
		return artist;
	}
	public void setArtist(Artiste artist) {
		this.artist = artist;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public void AjouterTitre(TitreMusic t) {
		music.add(t);
	}
	
	
}
