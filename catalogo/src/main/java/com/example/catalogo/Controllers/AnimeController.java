package com.example.catalogo.Controllers;

import com.example.catalogo.Desenho.DesenhoRepository;
import com.example.catalogo.Desenho.DesenhoRequestDTO;
import com.example.catalogo.Desenho.DesenhoResponseDTO;
import com.example.catalogo.Desenho.Desenho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Long.valueOf;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @Autowired
    private DesenhoRepository DesenhoRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DesenhoResponseDTO> setAll(){
        List<DesenhoResponseDTO> AnimeList = DesenhoRep.findAll().stream().map(DesenhoResponseDTO::new).toList();
        return AnimeList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAnime(@RequestBody DesenhoRequestDTO data){
        Desenho desenhoData = new Desenho(data);
        DesenhoRep.save(desenhoData);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable("id") Long id){
        DesenhoRep.deleteById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void updateAnime(@PathVariable("id") Long id, @RequestBody DesenhoRequestDTO data){
        Desenho desenho = DesenhoRep.getReferenceById(id);
        desenho.setId(data.id());
        desenho.setNome(data.nome());
        desenho.setAutor(data.autor());
        desenho.setDescricao(data.descricao());
        desenho.setDisponibilidade(data.disponibilidade());
        desenho.setEstudio(data.estudio());
        desenho.setMaxEps(data.maxeps());
        desenho.setMesAno(data.mesAno());
        desenho.setNacionalidade(data.nacionalidade());
        desenho.setStatus(data.status());
        desenho.setStatusVisto(data.StatusVisto());
        desenho.setTemps(data.temps());
        DesenhoRep.save(desenho);
    }
}


