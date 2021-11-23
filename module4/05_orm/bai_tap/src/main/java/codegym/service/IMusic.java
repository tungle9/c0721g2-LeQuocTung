package codegym.service;

import codegym.model.MusicApp;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IMusic {

    List<MusicApp> findAll();

    MusicApp findOne(Integer id);

    void save(MusicApp MusicApp);


    boolean exists(Long id);

    List<MusicApp> findAll(List<Long> ids);

    long count();

    void delete(Integer id);

    void delete(MusicApp musicApps);

    void delete(List<MusicApp> musicApps);

    void deleteAll();

}
