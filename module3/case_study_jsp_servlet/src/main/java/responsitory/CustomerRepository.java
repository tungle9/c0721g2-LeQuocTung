package responsitory;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private String url = "jdbc:mysql://localhost:3306/furama_resort?allowPublicKeyRetrieval=true&useSSL=false";
    private String userName = "root";
    private String passWord = "123123q";
    private static final String SELECT_ALL = "select * from customer";
    private static final String UPDATE = "update customer set customer_name = ? , customer_email = ? , customer_birthday= ?, customer_phone =? , customer_id_card  = ? where customer_id = ?;";
    private static final String SELECT_ID = "select * from customer where customer_id = ?;";
    private static final String DELETE_ID = "delete from customer where customer_id =? ;";




    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, passWord);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        String query = "{call insert_customer(?,?,?,?,?,?)}";

        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, customer.getId());
            callableStatement.setString(2, customer.getName());
            callableStatement.setString(3, customer.getEmail());
            callableStatement.setString(4, customer.getBirthday());
            callableStatement.setInt(5, customer.getPhone());
            callableStatement.setString(6, customer.getIdCard());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("customer_name");
                String email = rs.getString("customer_email");
                String birthday = rs.getString("customer_birthday");
                int phone = Integer.parseInt(rs.getString("customer_phone"));
                String card = rs.getString("customer_id_card");
                customers.add(new Customer(id, name, email, birthday, phone, card));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean delete;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     DELETE_ID);) {
            statement.setInt(1, id);
            delete = statement.executeUpdate() > 0;
        }
        return delete;
    }

    @Override
    public boolean update(Customer customer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE);) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getBirthday());
            statement.setInt(4, customer.getPhone());
            statement.setString(5, customer.getIdCard());
            statement.setInt(6,customer.getId());


            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    public Customer select(int id) {
        Customer customer = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("customer_name");
                String email = rs.getString("customer_email");
                String birthday = rs.getString("customer_birthday");
                int phone = Integer.parseInt(rs.getString("customer_phone"));
                String idCard = rs.getString("customer_id_card");
                customer = new Customer(id, name, email, birthday, phone, idCard);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customer;
    }
}
