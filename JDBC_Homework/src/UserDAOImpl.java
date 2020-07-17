import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

//实现UserDAO接口中的方法
public class UserDAOImpl implements UserDAO {

    @Override
    public void updateUser(User user) throws Exception {
        String sql = "INSERT INTO user(name, pwd, FEmail, birthday) VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = null;
        DatabaseConnection databaseConnection = null;
        try {
            databaseConnection = new DatabaseConnection();
            preparedStatement = databaseConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPwd());
            preparedStatement.setString(3,user.getFEmail());
            preparedStatement.setString(4,user.getBirthday());
            preparedStatement.executeUpdate();
            System.out.println("操作成功，添加用户："+user.name);
            preparedStatement.close();
        }  catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateUserBirthday(String name) throws Exception {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = ft.format(dNow);
        String sql = "UPDATE user SET birthday = ? WHERE name = ?";
        PreparedStatement preparedStatement = null;
        DatabaseConnection databaseConnection = null;
        try {
            databaseConnection = new DatabaseConnection();
            preparedStatement = databaseConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,birthday);
            preparedStatement.setString(2,name);
            preparedStatement.executeUpdate();
            System.out.println("操作成功，更新用户日期");
            preparedStatement.close();
        }  catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(String name) {
        String sql = "DELETE FROM user WHERE name=?";
        PreparedStatement preparedStatement = null;
        DatabaseConnection databaseConnection = null;
        try {
            databaseConnection = new DatabaseConnection();
            preparedStatement = databaseConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();
            System.out.println("用户"+name+"已删除");
            preparedStatement.close();
        }  catch (Exception e){
            e.printStackTrace();
        }

    }
}

