package com.example.demo.repository;

import com.example.demo.model.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album,Long> {
    //List<Album> findByName(String name);
    List<Album> findAlbumById(Long id);
}
