// This class represents a User in my mini backend project
public class User {
    private String userNameYusuf;
    private String userPass;

    public User(String userNameYusuf, String userPass){
        this.userNameYusuf = userNameYusuf;
        this.userPass = userPass;
    }

    public String getUserNameYusuf() { return userNameYusuf; }
    public String getUserPass() { return userPass; }
}
