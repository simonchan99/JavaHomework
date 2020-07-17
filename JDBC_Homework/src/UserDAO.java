import java.util.*;

//定义UserDAO接口中的方法
public interface UserDAO{

    public void updateUser(User user) throws Exception;
    public void updateUserBirthday(String name) throws Exception;
    public void deleteUser(String name) throws Exception;

}
