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

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to album: " + song.getTitle());
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    // Getter for releaseDate
    public String getReleaseDate() {
        return releaseDate;
    }

    public void displaySongs() {
        System.out.println("Album: " + title + " (Released: " + releaseDate + ")");
        for (Song song : songs) {
            System.out.println("- " + song.getTitle());
        }
    }

   
}
