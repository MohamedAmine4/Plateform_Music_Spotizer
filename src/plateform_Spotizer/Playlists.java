package plateform_Spotizer;

import java.util.ArrayList;
import java.util.List;

public class Playlists {
   
	private String nom;
	private List<TitreMusic> musiques;
	private Utulisateur utulisateur;
	public Playlists(String nom,Utulisateur utuilisateur, List<TitreMusic> musiques) {
		super();
		this.nom = nom;
		this.musiques = new ArrayList<>();
		this.utulisateur=utulisateur;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<TitreMusic> getMusiques() {
		return musiques;
	}
	public void setMusiques(List<TitreMusic> musiques) {
		this.musiques = musiques;
	}
	
	public void ajouterMusique(TitreMusic musique) {
        musiques.add(musique);
    }
}
