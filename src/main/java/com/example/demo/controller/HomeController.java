package com.example.demo.controller;

import com.example.demo.dao.AlbumDAO;
import com.example.demo.model.Album;
import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;

    private AlbumDAO albumDAO= new AlbumDAO();

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/albumlist")
    public String getAlbums(Model model) {
       List<Album> albums = albumDAO.getAlbumList();

        model.addAttribute("albums", albums);

        return "albumlist";
    }

    @RequestMapping("/productList/viewProduct")
    public String viewProduct() {
        return "viewProduct";
    }

    @RequestMapping("/test")
    public String test(){return "test";}
}
