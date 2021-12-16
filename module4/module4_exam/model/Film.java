package com.example.module4_exam.model;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Pattern(regexp = "^[C]L[-]+[1-9][0-9]{3}$", message = "format CL-XXXX X is a number!")
    @NotEmpty(message = "k dc de trong")
    private String idFilm;


    @NotEmpty(message = "not empty")
    private String name;


    @OneToMany(targetEntity = Showtime.class, mappedBy = "film", cascade = CascadeType.REMOVE)
    private List<Showtime> showtime;


    public Film() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Showtime> getShowtime() {
        return showtime;
    }

    public void setShowtime(List<Showtime> showtime) {
        this.showtime = showtime;
    }


}
