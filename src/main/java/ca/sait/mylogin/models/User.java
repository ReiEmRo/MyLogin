package ca.sait.mylogin.models;

import java.io.Serializable;

/**
 *
 * @author ReiEm
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public User() {
        
    }
    
    public User(String username, String password) {
        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
