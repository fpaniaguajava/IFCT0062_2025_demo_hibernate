package com.fernandopaniagua.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="tvideojuegos")
@NamedQuery(
        name = "findByPlatform",
        query = "FROM Videogame vg WHERE vg.platform = :platform"
)
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
    @ManyToOne
    @JoinColumn(name="idgenre")
    private Genre genre;

    public Videogame() {
    }

    public Videogame(String title, String platform, boolean multiplayer, int price, boolean status, Genre genre) {
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
        this.status = status;
        this.genre = genre;
    }

    public Videogame(int id, String title, String platform, boolean multiplayer, int price, boolean status, Genre genre) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
        this.status = status;
        this.genre = genre;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", multiplayer=" + multiplayer +
                ", price=" + price +
                ", status=" + status +
                ", genre=" + genre +
                '}';
    }
}
