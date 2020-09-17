package ajcfinalproject.model;
import java.time.*;
public class country {
    int countryId;
    String country;
    LocalDateTime createDate;
    String createdBy;
    LocalDateTime lastUpdate;
    String lastUpdateBy;

    public city(){};

    public city (int countryId, String country, LocalDateTime createDate, String createdBy, LocalDateTime lastUpdate, String lastUpdateBy) {
        super();
        this.cityId = countryId;
        this.city = country;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }

    public int getCountryId() {
        return cityId;
    }

    public void setCountryId() {
        this.cityId = cityId;
    }

    public String getCountry() {
        return city;
    }

    public void setCountry() {
        this.city = city;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate() {
        this.createDate = createDate;
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
