package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String albumTitle;
    private String artisteName;
    private String genre;
    private String albumName;
    private String albumCategory;
    private String albumDescription;
    private double albumPrice;
    private String albumCondition;
    private String albumStatus;
    private int unitInStock;
    private String albumManufacturer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtisteName() {
        return artisteName;
    }

    public void setArtisteName(String artisteName) {
        this.artisteName = artisteName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumCategory() {
        return albumCategory;
    }

    public void setAlbumCategory(String albumCategory) {
        this.albumCategory = albumCategory;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription;
    }

    public double getAlbumPrice() {
        return albumPrice;
    }

    public void setAlbumPrice(double albumPrice) {
        this.albumPrice = albumPrice;
    }

    public String getAlbumCondition() {
        return albumCondition;
    }

    public void setAlbumCondition(String albumCondition) {
        this.albumCondition = albumCondition;
    }

    public String getAlbumStatus() {
        return albumStatus;
    }

    public void setAlbumStatus(String albumStatus) {
        this.albumStatus = albumStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getAlbumManufacturer() {
        return albumManufacturer;
    }

    public void setAlbumManufacturer(String albumManufacturer) {
        this.albumManufacturer = albumManufacturer;
    }
}
