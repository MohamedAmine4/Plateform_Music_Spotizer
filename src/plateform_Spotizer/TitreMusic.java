package plateform_Spotizer;

import java.util.ArrayList;
import java.util.List;

public class TitreMusic {

	private String titre;
    private Artiste artiste;
    private Groupe membreGroupe;
    private Album album;
    private double duree;
    private double tempo;
    private String style;
    private String visuelUrl;
    private String statut;
    
	
	public TitreMusic(String titre, Artiste artiste, String style, double tempo, double duree,
			String visuelUrl, String statut) {
		super();
		this.titre = titre;
		this.artiste = artiste;
		this.duree = duree;
		this.tempo = tempo;
		this.style = style;
		this.visuelUrl = visuelUrl;
		this.statut = statut;
	}
	public TitreMusic(String titre, Groupe membreGroupe, String style, double tempo, double duree,
			String visuelUrl, String statut) {
		super();
		this.titre = titre;
		this.membreGroupe = membreGroupe;
		this.duree = duree;
		this.tempo = tempo;
		this.style = style;
		this.visuelUrl = visuelUrl;
		this.statut = statut;
	}



	public  String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Artiste getArtiste() {
		return artiste;
	}



	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}



	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getVisuelUrl() {
		return visuelUrl;
	}

	public void setVisuelUrl(String visuelUrl) {
		this.visuelUrl = visuelUrl;
	}



	public String getStatut() {
		return statut;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}
	
    
}
