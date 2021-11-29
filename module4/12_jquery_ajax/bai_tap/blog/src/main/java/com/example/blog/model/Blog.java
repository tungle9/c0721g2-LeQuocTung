package com.example.blog.model;

import javax.persistence.*;


@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String content;

    private String description;


    public Blog() {
    }


    @Override
    public String toString() {
        return String.format("Blog[id=%d, content='%s', description='%s']", id, content, description);
    }



    public Blog(Integer id, String content, String description) {
        this.id = id;
        this.content = content;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
