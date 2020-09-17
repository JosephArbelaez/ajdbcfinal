package ajcfinalproject.model;
import java.time.*;

public class address {
    int addressId;
    String address;
    String address2;
    int cityId;
    String postalCode;
    String phone;
    LocalDateTime createDate;
    String createdBy;
    LocalDateTime lastUpdate;
    String lastUpdateBy;

    public city(){};

    public city (int cityId, String city, int countryId, LocalDateTime createDate, String createdBy, LocalDateTime lastUpdate, String lastUpdateBy) {
        super();
        this.addressId = addressId;
        this.address = address;
        this.address2 = address2;
        this.cityId = cityId;
        this.postalCode = postalCode;
        this.phone = phone;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId() {
        this.addressId = addressId;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public int getAddress2() {
        return address2;
    }

    public void setAddress2() {
        this.address2 = address2;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId() {
        this.cityId = cityId;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode() {
        this.postalCode = postalCode;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy() {
        this.createdBy = createdBy;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate() {
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy() {
        this.lastUpdateBy = lastUpdateBy;
    }
}
