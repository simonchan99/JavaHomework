public class TestClass  {
    public static void main(String[] args) throws Exception {
        UserDAOImpl userDAO = new UserDAOImpl();

        //插入如下数据
        userDAO.updateUser(new User("张三","888888","zhangsan@126.com","1986-10-11"));
        userDAO.updateUser(new User("李四","999999","lisi@126.com","1988-10-23"));
        userDAO.updateUser(new User("王五","777777","wangwu@126.com","1990-9-11"));

        //张三的时间更新为当前系统时间
        userDAO.updateUserBirthday("张三");

        //删除名为李四的全部记录
        userDAO.deleteUser("李四");

    }
}
