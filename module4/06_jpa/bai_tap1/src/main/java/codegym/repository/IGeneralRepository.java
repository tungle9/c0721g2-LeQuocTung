package codegym.repository;



import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IGeneralRepository<T> {
    List<T> findAll();

    T findById(Integer id);

    void save(T t);

    void remove(Integer id);
}
