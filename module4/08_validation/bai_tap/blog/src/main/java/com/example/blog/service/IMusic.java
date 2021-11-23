package com.example.blog.service;


import com.example.blog.model.MusicApp;

import java.util.List;

public interface IMusic {
    List<MusicApp> finAll();

    void save(MusicApp musicApp);

    MusicApp findById(Integer id);

    void remove(Integer id);

}
