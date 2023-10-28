package plateform_Spotizer;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

	private String nom;
	private ArrayList<Artiste> membreGroupe =new ArrayList<>();
	
	
	public Groupe(String nom) {
		super();
		this.nom = nom;
		
	}

	public List<Artiste> getMembreGroupe() {
		return membreGroupe;
	}

	public void setMembreGroupe(ArrayList<Artiste> membreGroupe) {
		this.membreGroupe = membreGroupe;
	}
	
	 public void ajouterMembre(Artiste membre) {
		 membreGroupe.add(membre);
	    }
	 public TitreMusic CreerMusicGroupe(String titre, Groupe artiste, String style, double tempo, double duree,
				String visuelUrl, String statut) {
			TitreMusic T= new TitreMusic( titre,  artiste,    style,  tempo,  duree,
					 visuelUrl,  statut);
			return T;
		}
}
