package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.Song;

import java.util.HashSet;
import java.util.Set;

public class SongMain {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Love DnB");
        song1.setArtist("SubFocus");
        song1.setLength(4.35);


        Song song2 = new Song();
        song2.setTitle("Love DnB");
        song2.setArtist("SubFocus");
        song2.setLength(4.35);

        System.out.println("song1 equals song2: " + song1.equals(song2));
        System.out.println("song1 hashcode: " + song1.hashCode());
        System.out.println("song2 hashcode: " + song2.hashCode());

        Set<Song>album = new HashSet<>();
        album.add(song1);
        album.add(song2);

        System.out.println("The album's size is: " + album.size());
        System.out.println(song1);
    }
}
