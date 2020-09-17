package ajcfinalproject.model;

import java.time.*;

public class city {
    int cityId;
    String city;
    int countryId;
    LocalDateTime createDate;
    String createdBy;
    LocalDateTime lastUpdate;
    String lastUpdateBy;

    public city(){};

    public city (int cityId, String city, int countryId, LocalDateTime createDate, String createdBy, LocalDateTime lastUpdate, String lastUpdateBy) {
        super();
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId() {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId() {
        this.countryId = countryId;
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
