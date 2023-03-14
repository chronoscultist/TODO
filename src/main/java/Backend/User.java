package Backend;

public class User {
    private String email;
    private static String username;
    private static String password;
    private String createdAt;
    private String lastLogin;


    // DOOOOOOO WE NEED SETTERS?

    public User(){
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public static String getUserName() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public static void setUserName(String username) {   // static?  // why static?      // why static? //I dont know, can you fix it?
        User.username = username;
    }

    public static void setPassword(String password) {
        User.password = password;
    }
}
