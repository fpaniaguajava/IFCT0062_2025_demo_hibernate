package com.fernandopaniagua.demo.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StudioPK implements Serializable {
    private String name;
    private int year;

    public StudioPK() {
    }

    public StudioPK(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
