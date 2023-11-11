public class PlayListEntry {
    private String singer;
    private Song toSing;

    public PlayListEntry(String s, Song ts) {
        singer = s;
        toSing = ts;
    }

    public String toString() {
        return singer + " will be singing " + toSing.getTitle() + " by " + toSing.getArtist() + ".";
    }
}
