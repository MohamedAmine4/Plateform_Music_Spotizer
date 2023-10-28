package plateform_Spotizer;

public class Cover extends TitreMusic {
    private String coverArtist; 
    private String coverType;
    private String releaseDate; 

    public Cover(String titre, Artiste artiste, Album album, double duree, double tempo, String visuel, String statut, String style, String coverArtist, String coverType, String releaseDate) {
        super(titre, artiste, visuel, duree, tempo, statut, style);
        this.coverArtist = coverArtist;
        this.coverType = coverType;
        this.releaseDate = releaseDate;
    }

    public String getCoverArtist() {
        return coverArtist;
    }

    public void setCoverArtist(String coverArtist) {
        this.coverArtist = coverArtist;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}