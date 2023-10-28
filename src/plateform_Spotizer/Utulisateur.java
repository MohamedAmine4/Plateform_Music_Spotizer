package plateform_Spotizer;

import java.util.ArrayList;
import java.util.List;

public class Utulisateur {
   
	private String nom;
	private double solde;
	private List<Playlists> playlists;
	private boolean isHDUser; // Indique si l'utilisateur a choisi l'option HD
    private double HDPricePer5Minutes = 0.03;
    private double standardPricePer5Minutes = 0.02;
	public Utulisateur(String nom, double solde) {
		super();
		this.nom = nom;
		this.solde = solde;
		   this.playlists = new ArrayList<>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Playlists> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlists> playlists) {
		this.playlists = playlists;
	}

	public Playlists CrererPlaylist(String nom,Utulisateur utuilisateur, List<TitreMusic> musiques) {
		Playlists p=new Playlists( nom, utuilisateur,  musiques);
		playlists.add(p);
		return p;
	}
	
	public void AjouterMusicPlaylist(TitreMusic m,Playlists l) {
		  l.ajouterMusique(m);	
	}
	
	
	public void enableHDSubscription() {
        isHDUser = true;
    }

    public void listenToTrack(TitreMusic track) {
        double pricePer5Minutes = isHDUser ? HDPricePer5Minutes : standardPricePer5Minutes;
        double price = (track.getDuree() / 5) * pricePer5Minutes;
        if (solde >= price) {
        	solde -= price;
        	Artiste t=track.getArtiste();
        	t.setSolde(price * 0.66);
           // 66% goes to the artist
            
        } else {
            System.out.println("Insufficient solde. Verifier votre Solde.");
        }
    }
	
	
	
	
	
	
}
