package responsitory;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepos {


     void insertService(Service service) throws SQLException;

     Service selectService(String id);

     List<Service> selectAll();

     boolean deleteId(String id) throws SQLException;

     boolean updateService(Service service) throws SQLException;


}
