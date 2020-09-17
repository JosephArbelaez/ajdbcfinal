package ajcfinalproject.model;
import java.time.*;

public class user {
    
    int userId;
    String userName;
    String password;
    String active;
    LocalDateTime createDate;
    String createdBy;
    LocalDateTime lastUpdate;
    String lastUpdateBy;

    public user(){};
    public user(int userId, String userName, String password, String active, LocalDateTime lastUpdate, String lastUdpateBy){
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public String getUsername(){
        return userName;
    }
    public void setUsername(String username){
        this.userName = userName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getActive(){
        return active;
    }
    public void setString(String active){
        this.active = active;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }
    public void setLastUpdateBy(String lastUpdateby) {
        this.lastUpdateBy = lastUpdateBy;
    }
}   
