public class Song {
    private String title;
    private String artist;
    private String time;

    // create the Song class and necessary constructors.
    public Song() {
        title = "";
        artist = "";
        time = "";
    }

    public Song(String title, String artist, String time) {
        this.title = title;
        this.artist = artist;
        this.time = time;
    }
    // Be sure to include getters and setters and a toString

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist + "  " + time;
    }

}
