package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;


    // bài thực hành
    // Gọi MySql Stored Procedures từ JDBCAssignment

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    // MySql JDBC TransactionAssignment

    void addUserTransaction(User user, int[] permision);

    // Thực thi SQL có sử dụng Transaction

     void insertUpdateUseTransaction();
}

