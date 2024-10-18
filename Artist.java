import java.util.ArrayList;

public class Artist {
    private String name;
    private String genre;
    private ArrayList<Album> albums;

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.albums = new ArrayList<>();  // Initialize the ArrayList
    }

    // Add an album to the artist's collection
    public void addAlbum(Album album) {
        albums.add(album);
        System.out.println("Album added: " + album.getTitle());
    }

    // Display all albums of the artist
    public void displayAlbums() {
        if (albums.isEmpty()) {
            System.out.println("No albums available for artist: " + name);
        } else {
            for (Album album : albums) {
                System.out.println("Album: " + album.getTitle() + " (Released: " + album.getReleaseDate() + ")");
                album.displaySongs();  // Assuming Album class has a displaySongs() method
            }
        }
    }

    // Getter for artist's name
    public String getName() {
        return name;
    }

    // Getter for artist's genre
    public String getGenre() {
        return genre;
    }
}
