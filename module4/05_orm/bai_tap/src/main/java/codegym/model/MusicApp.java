package codegym.model;


import javax.persistence.*;

@Entity
@Table
public class MusicApp implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String singer;
    private String genre;
    private String urlSong;


//    @Override
//    public MusicApp clone() {
//        MusicApp musicApp = new MusicApp();
//        musicApp.setName(name);
//        musicApp.setSinger(singer);
//        musicApp.setGenre(genre);
//        return musicApp;
//    }



    public MusicApp() {
    }

    public MusicApp(int id, String name, String singer, String genre, String urlSong) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.urlSong = urlSong;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrlSong() {
        return urlSong;
    }

    public void setUrlSong(String urlSong) {
        this.urlSong = urlSong;
    }
}
