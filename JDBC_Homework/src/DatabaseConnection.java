import java.sql.*;

public class DatabaseConnection {
    //初始化连接信息
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "awpak228";
    private Connection connection = null;

    //尝试建立数据库连接
    public DatabaseConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            this.connection = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }

    public void CloseConnection() throws SQLException {
        connection.close();
    }

}
