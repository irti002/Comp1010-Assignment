import java.util.ArrayList;

public class Album {
    private String title;
    private String releaseDate;
    private ArrayList<Song> songs;

    public Album(String title, String releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>();
    }

    // Add song to album
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to album: " + song.getTitle());
    }

    // Display all songs in the album
    public void displaySongs() {
        System.out.println("Songs in album: " + title);
        for (Song song : songs) {
            System.out.println("- Song: " + song.getTitle() + " (" + song.getDuration() + " seconds, Single: " + song.isSingle() + ")");
        }
    }

    // album title fetch
    public String getTitle() {
        return title;
    }

    // album release date fetch
    public String getReleaseDate() {
        return releaseDate;
    }

    // Fetch song list
    public ArrayList<Song> getSongs() {
        return songs;
    }
}
