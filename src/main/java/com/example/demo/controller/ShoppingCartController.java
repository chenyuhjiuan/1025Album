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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.nio.file.Path;

@Controller
public class ShoppingCartController {

    @Autowired
    AlbumRepository albumRepository;

    @RequestMapping("/user")
    public String userPage(){
        return "user";
    }

    @RequestMapping("/user/albumlist")
    public String getAlbums(Model model) {

        model.addAttribute("albums", albumRepository.findAll());

        return "albumlist";
    }

    @RequestMapping("/user/albumInventory/detail_album/{id}")

    public String showEmployee(@PathVariable("id") long id, Model model){

        model.addAttribute("album", albumRepository.findById(id).get());

        return "showalbum";

    }

    /*@RequestMapping("/test")
    public String test(){return "test";}*/





}
