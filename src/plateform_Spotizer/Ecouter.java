package plateform_Spotizer;

public class Ecouter {

	public static void main(String[] args) {
            
		Artiste artist1=new Artiste("Amine");
		Artiste artist2=new Artiste("Akram");
		Artiste artist3=new Artiste("Mohamed");

		Groupe grp1=new Groupe("A");
		grp1.ajouterMembre(artist1);
		grp1.ajouterMembre(artist2);
		
		Album album1=new Album("RGad", artist1, "URLVisuel");		
		Album album2=new Album("JGad", artist2, "URLVisuel");

		TitreMusic music1=new TitreMusic("RapGad", artist1, "RAP", 2, 6, "URLVisuel", "attend");
		TitreMusic music2=new TitreMusic("JazzGad", artist2, "Jazz", 2, 5, "URLVisuel", "attend");
		TitreMusic music3=new TitreMusic("ClassGad", artist2, "class", 2, 4, "URLVisuel", "attend");

		artist1.ajouterMusic(music1);
		artist2.ajouterMusic(music2);
		artist3.ajouterMusic(music3);
		
		
		Utulisateur u1=new Utulisateur( "Dorian",45); //45 euro
		Playlists p1=u1.CrererPlaylist("Playlist1", u1, null);
		u1.AjouterMusicPlaylist(music1, p1);
		System.out.println("solde de artiste avant="+artist1.getSolde());
		System.out.println("solde de utulisateur avant="+u1.getSolde());

		u1.enableHDSubscription();
		u1.listenToTrack(music1);
		System.out.println("solde de artiste apres que utulisateur a ecouté le track="+artist1.getSolde());

		System.out.println("solde de Utulisateur apres le track="+u1.getSolde());


		
	}

}
