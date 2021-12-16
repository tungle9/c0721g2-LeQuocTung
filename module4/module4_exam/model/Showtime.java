package com.example.module4_exam.model;


import javax.persistence.*;

@Entity
public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dateTime;

    private int quantity;


    @ManyToOne
    @JoinColumn(name = "showTime_film")
    private Film film;


    public Showtime(Integer id, String dateTime, int quantity, Film film) {
        this.id = id;
        this.dateTime = dateTime;
        this.quantity = quantity;
        this.film = film;
    }

    public Showtime() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return dateTime + ",quantity : "+quantity;
    }
}
