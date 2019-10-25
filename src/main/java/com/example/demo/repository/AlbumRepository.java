package com.example.demo.repository;

import com.example.demo.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Long> {
}
