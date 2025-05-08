package com.fernandopaniagua.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Studio {
    @EmbeddedId
    private StudioPK id;
    private String name;
    private String country;

    public Studio() {
    }

    public Studio(StudioPK id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public StudioPK getId() {
        return id;
    }

    public void setId(StudioPK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
