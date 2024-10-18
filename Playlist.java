import java.util.ArrayList;
import java.util.Random;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;
    private int currentIndex = -1;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Add song to playlist (fixing the addSong(Song) issue)
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to playlist: " + song.getTitle());
    }

    // Play the next song
    public void playNext() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }
        currentIndex = (currentIndex + 1) % songs.size();
        songs.get(currentIndex).play();
    }

    // Play the previous song
    public void playPrevious() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }
        currentIndex = (currentIndex - 1 + songs.size()) % songs.size();
        songs.get(currentIndex).play();
    }

    // Shuffle play (recursive)
    public void shufflePlay() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }
        int previousIndex = currentIndex;
        currentIndex = shuffleRecursive(previousIndex);
        songs.get(currentIndex).play();
    }

    // Recursive shuffle that prevents repeating the same song consecutively
    private int shuffleRecursive(int previousIndex) {
        Random random = new Random();
        int newIndex = random.nextInt(songs.size());
        if (newIndex != previousIndex) {
            return newIndex;
        }
        return shuffleRecursive(previousIndex);  // Recursively shuffle until a different song is selected
    }

    // Display all songs in the playlist
    public void displaySongs() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            System.out.println("- " + song.getTitle());
        }
    }
}
