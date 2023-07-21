package com.example.catalogo.Controllers;

import com.example.catalogo.Novela.NovelaRepository;
import com.example.catalogo.Novela.NovelaRequestDTO;
import com.example.catalogo.Novela.NovelaResponseDTO;
import com.example.catalogo.Novela.Novela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Novela")
public class NovelaController {

    @Autowired
    private NovelaRepository NovelaRep;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<NovelaResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<NovelaResponseDTO> NovelaList = NovelaRep.findAll().stream().map(NovelaResponseDTO::new).toList();
        return NovelaList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveNovela(@RequestBody NovelaRequestDTO data){
        Novela NovelaData = new Novela(data);
        NovelaRep.save(NovelaData);

    }
}
