package it.contrader.blog.controller;

import it.contrader.blog.dto.ArticoloDTO;
import it.contrader.blog.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articolo")
public class ArticoloController {

    @Autowired
    public ArticoloService articoloService;

@GetMapping("/getall")
    public List<ArticoloDTO> getAll(){return articoloService.getAll();}

}
