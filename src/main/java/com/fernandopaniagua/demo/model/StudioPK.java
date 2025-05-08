package com.fernandopaniagua.demo.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StudioPK implements Serializable {
    private String namePK;
    private int prefix;

    public StudioPK() {
    }

    public StudioPK(String name, int prefix) {
        this.namePK = name;
        this.prefix = prefix;
    }

    public String getNamePK() {
        return namePK;
    }

    public void setNamePK(String namePK) {
        this.namePK = namePK;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }
}
