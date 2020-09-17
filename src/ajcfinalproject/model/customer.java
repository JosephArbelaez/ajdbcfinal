package ajcfinalproject.model;
import java.time.*;

public class customer {
    
    int customerId;
    String customerName;
    int addressId;
    String active;
    LocalDateTime createDate;
    String createdBy;
    LocalDateTime lastUpdate;
    String lastUpdateBy;

    public customer(){};
    public customer(int customerId, String customerName, int addressId, String active, LocalDateTime createDate, String createdBy, LocalDateTime lastUpdate, String lastUdpateBy){
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressId = addressId;
        this.active = active;
        this.createDate = createDate;
        this.createdBy = createdBy;        
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public int getaddressId(){
        return addressId;
    }
    public void setaddressId(int addressId) {
        this.addressId = addressId;
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
