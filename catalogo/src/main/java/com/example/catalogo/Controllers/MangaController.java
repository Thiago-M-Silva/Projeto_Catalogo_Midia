package com.example.catalogo.Controllers;

import com.example.catalogo.Manga.MangaRepository;
import com.example.catalogo.Manga.MangaRequestDTO;
import com.example.catalogo.Manga.MangaResponseDTO;
import com.example.catalogo.Manga.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Manga")
public class MangaController {

    @Autowired
    private MangaRepository MangaRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<MangaResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<MangaResponseDTO> MangaList = MangaRep.findAll().stream().map(MangaResponseDTO::new).toList();
        return MangaList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveManga(@RequestBody MangaRequestDTO data){
        Manga MangaData = new Manga(data);
        MangaRep.save(MangaData);

    }
}
