package com.example.catalogo.Controllers;

import com.example.catalogo.Anime.AnimeRepository;
import com.example.catalogo.Anime.AnimeRequestDTO;
import com.example.catalogo.Anime.AnimeResponseDTO;
import com.example.catalogo.Anime.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @Autowired
    private AnimeRepository AnimeRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<AnimeResponseDTO> getAll(){
        List<AnimeResponseDTO> AnimeList = AnimeRep.findAll().stream().map(AnimeResponseDTO::new).toList();
        return AnimeList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAnime(@RequestBody AnimeRequestDTO data){
        Anime AnimeData = new Anime(data);
        AnimeRep.save(AnimeData);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable("id") Long id){
        AnimeRep.deleteById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void updateAnime(@PathVariable("id") Long id, @RequestBody AnimeRequestDTO data){
        AnimeRep.deleteById(id);
        Anime AnimeData = new Anime(data);
        AnimeRep.save(AnimeData);
    }
}
