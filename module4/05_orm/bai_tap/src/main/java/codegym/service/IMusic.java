package codegym.service;

import codegym.model.MusicApp;

import java.util.List;

public interface IMusic {

    List<MusicApp> findAll();

    MusicApp findOne(Long id);

    void save(MusicApp MusicApp);


    boolean exists(Long id);

    List<MusicApp> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(MusicApp musicApps);

    void delete(List<MusicApp> musicApps);

    void deleteAll();

}
