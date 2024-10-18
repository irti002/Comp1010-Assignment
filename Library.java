import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Album> albums;
    private ArrayList<Song> songs;

    public Library(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getSongs());
        System.out.println("Album added to library: " + album);
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to library: " + song.getTitle());
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Albums:");
        for (Album album : albums) {
            album.displaySongs();
        }
        System.out.println("Songs:");
        for (Song song : songs) {
            System.out.println("- " + song.getTitle());
        }
    }
}
