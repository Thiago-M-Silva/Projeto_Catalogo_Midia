package com.example.catalogo.Controllers;

import com.example.catalogo.Anime.Anime;
import com.example.catalogo.Anime.AnimeRequestDTO;
import com.example.catalogo.Filme.FilmeRepository;
import com.example.catalogo.Filme.FilmeRequestDTO;
import com.example.catalogo.Filme.FilmeResponseDTO;
import com.example.catalogo.Filme.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filme")
public class FilmeController {

    @Autowired
    private FilmeRepository FilmeRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FilmeResponseDTO> getAll(){
        List<FilmeResponseDTO> FilmeList = FilmeRep.findAll().stream().map(FilmeResponseDTO::new).toList();
        return FilmeList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFilme(@RequestBody FilmeRequestDTO data){
        Filme FilmeData = new Filme(data);
        FilmeRep.save(FilmeData);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteFilme(@PathVariable("id") Long id){
        FilmeRep.deleteById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void updateFilme(@PathVariable("id") Long id, @RequestBody FilmeRequestDTO data){
        FilmeRep.deleteById(id);
        Filme FilmeData = new Filme(data);
        FilmeRep.save(FilmeData);
    }
}
