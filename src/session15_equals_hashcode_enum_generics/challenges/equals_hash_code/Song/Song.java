package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.Song;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private double length;

    public String getTitle() {
        return title;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getArtist(), song.getArtist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getArtist());
    }

    @Override
    public String toString() {
        return "Song: " +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length;
    }
}
