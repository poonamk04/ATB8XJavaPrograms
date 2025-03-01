package Oct.ex_11102024.ecap;

public class GoodVWOLogin {
    private String username ;
    private String password;
    public GoodVWOLogin(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
