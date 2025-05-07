package com.fernandopaniagua.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="tvideojuego")
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String platform;
    private boolean multiplayer;
    @Column(name="pvp")
    private int price;
    @Transient
    private boolean status;

    public Videogame() {
    }

    public Videogame(String title, String platform, boolean multiplayer, int price, boolean status) {
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
        this.status = status;
    }

    public Videogame(int id, String title, String platform, boolean multiplayer, int price, boolean status) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
