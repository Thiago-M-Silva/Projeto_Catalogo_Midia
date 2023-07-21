package com.example.catalogo.Controllers;

import com.example.catalogo.Livro.LivroRepository;
import com.example.catalogo.Livro.LivroRequestDTO;
import com.example.catalogo.Livro.LivroResponseDTO;
import com.example.catalogo.Livro.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Livro")
public class LivroController {

    @Autowired
    private LivroRepository LivroRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<LivroResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<LivroResponseDTO> LivroList = LivroRep.findAll().stream().map(LivroResponseDTO::new).toList();
        return LivroList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveLivro(@RequestBody LivroRequestDTO data){
        Livro LivroData = new Livro(data);
        LivroRep.save(LivroData);

    }
}
