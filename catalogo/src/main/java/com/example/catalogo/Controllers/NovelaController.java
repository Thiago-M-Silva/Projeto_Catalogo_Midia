package com.example.catalogo.Controllers;

import com.example.catalogo.Filme.Filme;
import com.example.catalogo.Filme.FilmeRequestDTO;
import com.example.catalogo.Novela.NovelaRepository;
import com.example.catalogo.Novela.NovelaRequestDTO;
import com.example.catalogo.Novela.NovelaResponseDTO;
import com.example.catalogo.Novela.Novela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("novela")
public class NovelaController {

    @Autowired
    private NovelaRepository NovelaRep;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<NovelaResponseDTO> getAll(){
        List<NovelaResponseDTO> NovelaList = NovelaRep.findAll().stream().map(NovelaResponseDTO::new).toList();
        return NovelaList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveNovela(@RequestBody NovelaRequestDTO data){
        Novela NovelaData = new Novela(data);
        NovelaRep.save(NovelaData);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteNovela(@PathVariable("id") Long id){
        NovelaRep.deleteById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void updateNovela(@PathVariable("id") Long id, @RequestBody NovelaRequestDTO data){
        NovelaRep.deleteById(id);
        Novela NovelaData = new Novela(data);
        NovelaRep.save(NovelaData);
    }
}
