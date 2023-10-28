package plateform_Spotizer;

public class Remix extends TitreMusic {
    private TitreMusic newTrack; 
    private String remixType; 
    private String remixer; 
    private String releaseDate;

    public Remix(String titre, Artiste artiste, Album album, double duree, double tempo, String visuel, String statut, String style, TitreMusic newtitre, String remixType, String remixer, String releaseDate, double price) {
        super(titre, artiste, visuel, duree, tempo, statut, style);
        this.remixType = remixType;
        this.remixer = remixer;
        this.releaseDate = releaseDate;
        this.newTrack = newtitre;
    }


    public TitreMusic newTrack() {
        return newTrack;
    }

    public void setnewTrack(TitreMusic newTrack) {
        this.newTrack = newTrack;
    }

    public String getRemixType() {
        return remixType;
    }

    public void setRemixType(String remixType) {
        this.remixType = remixType;
    }

    public String getRemixer() {
        return remixer;
    }

    public void setRemixer(String remixer) {
        this.remixer = remixer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}