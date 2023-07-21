package com.example.catalogo.Controllers;

import com.example.catalogo.Anime.AnimeRepository;
import com.example.catalogo.Anime.AnimeRequestDTO;
import com.example.catalogo.Anime.AnimeResponseDTO;
import com.example.catalogo.Anime.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Anime")
public class AnimeController {

    @Autowired
    private AnimeRepository AnimeRep;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<AnimeResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<AnimeResponseDTO> AnimeList = AnimeRep.findAll().stream().map(AnimeResponseDTO::new).toList();
        return AnimeList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAnime(@RequestBody AnimeRequestDTO data){
        Anime AnimeData = new Anime(data);
        AnimeRep.save(AnimeData);

    }
}
