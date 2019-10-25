package com.example.demo.dao;

import com.example.demo.model.Album;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlbumDAO {
private List<Album> albumList;

public List<Album> getAlbumList() {
    Album album1 = new Album();
    album1.setAlbumName("Guitar1");
    album1.setAlbumCategory("Instrument");
    album1.setAlbumDescription("This is a fender strat guitar!");
    album1.setAlbumPrice(1200);
    album1.setAlbumCondition("new");
    album1.setAlbumStatus("Active");
    album1.setUnitInStock(11);
    album1.setAlbumManufacturer("Fender");

    Album album2 = new Album();
    album2.setAlbumName("Record1");
    album2.setAlbumCategory("Record");
    album2.setAlbumDescription("This is an awesome mix of 20th century!");
    album2.setAlbumPrice(25);
    album2.setAlbumCondition("new");
    album2.setAlbumStatus("Active");
    album2.setUnitInStock(51);
    album2.setAlbumManufacturer("EMI");

    Album album3 = new Album();
    album3.setAlbumName("Speaker1");
    album3.setAlbumCategory("Accessory");
    album3.setAlbumDescription("This is a Polk Shelf Speaker!");
    album3.setAlbumPrice(355);
    album3.setAlbumCondition("new");
    album3.setAlbumStatus("Active");
    album3.setUnitInStock(59);
    album3.setAlbumManufacturer("EMI");

    albumList=new ArrayList<Album>();

    albumList.add(album1);
    albumList.add(album2);
    albumList.add(album3);

    return albumList;
}
}
