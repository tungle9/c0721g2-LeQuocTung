package com.example.blog.model;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class MusicApp implements Validator {

    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String singer;

    @NotNull
    private String genre;


    private String urlSong;


    public MusicApp() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public MusicApp(Integer id, @NotBlank String name, @NotBlank String singer, @NotBlank String genre, String urlSong) {
//        this.id = id;
//        this.name = name;
//        this.singer = singer;
//        this.genre = genre;
//        this.urlSong = urlSong;
//    }

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

    @Override
    public boolean supports(Class<?> clazz) {
        return MusicApp.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        MusicApp musicApp = (MusicApp) target;
        String name = musicApp.getName();
        String singer = musicApp.getSinger();
        String genre = musicApp.getName();

        ValidationUtils.rejectIfEmpty(errors, "singer", "singer.empty");

        if(!name.matches("([a-zA-Z0-9]{800})")){
            errors.rejectValue("name","number.regex");
        }
        if(!singer.matches("([a-zA-Z0-9]{300})")){
            errors.rejectValue("singer","singer.regex");
        }
        if(!genre.matches("([^,][a-zA-Z]{1000})")){
            errors.rejectValue("genre","genre.regex");

        }

    }
}
