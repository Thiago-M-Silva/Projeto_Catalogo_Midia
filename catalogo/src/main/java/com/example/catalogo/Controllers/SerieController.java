package com.example.catalogo.Controllers;

import com.example.catalogo.Serie.SerieRepository;
import com.example.catalogo.Serie.SerieRequestDTO;
import com.example.catalogo.Serie.SerieResponseDTO;
import com.example.catalogo.Serie.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Serie")
public class SerieController {

    @Autowired
    private SerieRepository SerieRep;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<SerieResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<SerieResponseDTO> SerieList = SerieRep.findAll().stream().map(SerieResponseDTO::new).toList();
        return SerieList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveSerie(@RequestBody SerieRequestDTO data){
        Serie SerieData = new Serie(data);
        SerieRep.save(SerieData);

    }
}