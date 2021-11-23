package com.example.blog.service;


import com.example.blog.model.MusicApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HiMusicApp implements IMusic {
    private static final List<MusicApp> music = new ArrayList<>();


    @Override
    public List<MusicApp> finAll() {
        return music;
    }

    @Override
    public void save(MusicApp musicApp) {
        music.add(musicApp);

    }

    @Override
    public MusicApp findById(Integer id) {
        return music.get(id);
    }

    @Override
    public void remove(Integer id) {
        music.remove(id);

    }
}
