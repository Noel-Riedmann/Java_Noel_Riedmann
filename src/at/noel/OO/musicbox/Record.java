package at.noel.OO.musicbox;

public class Record {
    private String title;
    private String artist;
    private double duration;

    public Record(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;

    }
}
