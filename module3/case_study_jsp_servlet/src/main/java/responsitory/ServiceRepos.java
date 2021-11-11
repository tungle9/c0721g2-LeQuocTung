package responsitory;

import model.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepos implements IServiceRepos {
    private String url = "jdbc:mysql://localhost:3306/furama_resort?useSSL=false";
    private String userName = "root";
    private String passWord = "123123q";

    private static final String INSERT = "insert into service (service_id,service_name,service_area," +
            "service_max_people,standard_room,description_other_convenience) values(?,?,?,?,?,?);";
    private static final String SELECT_ID = "select * from service where service_id=?";
    private static final String SELECT_ALL = "select * from service";
    private static final String UPDATE = "update service set service_name = ? ,service_area = ?," +
            "service_max_people = ? , standard_room = ? ,description_other_convenience=? where service_id = ? ;";


    public ServiceRepos() {
    }

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
    public void insertService(Service service) throws SQLException {
        System.out.println("thêm service");

        try (Connection connection = getConnection();
             PreparedStatement pr = connection.prepareStatement(INSERT)) {
            pr.setString(1, service.getId());
            pr.setString(2, service.getName());
            pr.setString(3, service.getArea());
            pr.setString(4, service.getPeople());
            pr.setString(5, service.getStandardRoom());
            pr.setString(6, service.getDescription());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Service selectService(String id) {
        Service service = null;
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID);) {
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("service_name");
                String area = rs.getString("service_area");
                String people = rs.getString("service_max_people");
                String standard = rs.getString("standard_room");
                String description = rs.getString("description_other_convenience");

                service = new Service(id, name, area, people, standard, description);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return service;
    }


    @Override
    public List<Service> selectAll() {
        List<Service> services = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement pr = connection.prepareStatement(SELECT_ALL);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                String id = rs.getString("service_id");
                String name = rs.getString("service_name");
                String area = rs.getString("service_area");
                String people = rs.getString("service_max_people");
                String standard = rs.getString("standard_room");
                String description = rs.getString("description_other_convenience");

                services.add(new Service(id, name, area, people, standard, description));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return services;
    }

    @Override
    public boolean deleteId(String id) throws SQLException {

        return false;
    }

    @Override
    public boolean updateService(Service service) throws SQLException {
        boolean row;
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(UPDATE);
        statement.setString(1, service.getName());
        statement.setString(2, service.getArea());
        statement.setString(3, service.getPeople());
        statement.setString(4, service.getStandardRoom());
        statement.setString(5, service.getDescription());
        statement.setString(6, service.getId());

        row = statement.executeUpdate() > 0;

        return row;
    }
}
