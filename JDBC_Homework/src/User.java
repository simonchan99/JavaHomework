//User实体类
public class User {
    String name;
    String pwd;
    String FEmail;
    String birthday;

    public User(String name, String pwd, String FEmail, String birthday) {
        this.name = name;
        this.pwd = pwd;
        this.FEmail = FEmail;
        this.birthday = birthday;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFEmail() {
        return FEmail;
    }
    public void setFEmail(String FEmail) {
        this.FEmail = FEmail;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
