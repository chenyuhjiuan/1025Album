package com.example.demo.controller;


import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.nio.file.Path;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;


    private Path path;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

  /*  @RequestMapping("/albumlist")
    public String getAlbums(Model model) {

        model.addAttribute("albums", albumRepository.findAll());

        return "albumlist";
    }*/

    @RequestMapping("/admin/albumInventory/detail_album/{id}")

    public String showEmployee(@PathVariable("id") long id, Model model){

        model.addAttribute("album", albumRepository.findById(id).get());

        return "showalbum";

    }


    @RequestMapping("/admin")
    public String adminPage() {
        return "admin";
    }

   @RequestMapping("/admin/albumInventory")
    public String albumInventory(Model model) {

        model.addAttribute("albums", albumRepository.findAll());

        return "albumInventory";
    }


   @RequestMapping("/admin/albumInventory/addAlbum")
    public String addAlbum(Model model) {
        Album album = new Album();
        album.setAlbumCategory("instrument");
        album.setAlbumCondition("new");
        album.setAlbumStatus("active");

        model.addAttribute("album", album);

        return "addAlbum";
    }

    @PostMapping("/admin/albumInventory/addAlbum")
    public String addAlbumPost(@Valid Album album, BindingResult result){
        if(result.hasErrors()){
            return "addAlbum";
        }
        albumRepository.save(album);
        return "redirect:/admin/albumInventory";
    }

    @RequestMapping("/admin/albumInventory/delete_album/{id}")

    public String delAlbum(@PathVariable("id") long id) {

        albumRepository.deleteById(id);

        return "redirect:/admin/albumInventory";
    }


}
