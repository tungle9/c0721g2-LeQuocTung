package responsitory;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
     void insertCustomer(Customer customer) throws SQLException;


    List<Customer> findAll();

    boolean deleteCustomer(int id ) throws SQLException;

     boolean update(Customer customer) throws SQLException;
}
