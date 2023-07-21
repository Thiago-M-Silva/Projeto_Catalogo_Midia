package com.example.catalogo.Controllers;

import com.example.catalogo.Filme.FilmeRepository;
import com.example.catalogo.Filme.FilmeRequestDTO;
import com.example.catalogo.Filme.FilmeResponseDTO;
import com.example.catalogo.Filme.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Filme")
public class FilmeController {

    @Autowired
    private FilmeRepository FilmeRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FilmeResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<FilmeResponseDTO> FilmeList = FilmeRep.findAll().stream().map(FilmeResponseDTO::new).toList();
        return FilmeList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFilme(@RequestBody FilmeRequestDTO data){
        Filme FilmeData = new Filme(data);
        FilmeRep.save(FilmeData);

    }
}
