package com.fernandopaniagua.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Studio {
    @EmbeddedId
    private StudioPK id;
    private String description;
    private String country;

    public Studio() {
    }

    public Studio(StudioPK id, String description, String country) {
        this.id = id;
        this.description = description;
        this.country = country;
    }

    public StudioPK getId() {
        return id;
    }

    public void setId(StudioPK id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
