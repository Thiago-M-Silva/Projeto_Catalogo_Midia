package com.example.catalogo.Controllers;

import com.example.catalogo.Midia.MidiaRepository;
import com.example.catalogo.Midia.MidiaRequestDTO;
import com.example.catalogo.Midia.MidiaResponseDTO;
import com.example.catalogo.Midia.midia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("midia")
public class MidiaController {

    @Autowired
    private MidiaRepository midiaRep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<MidiaResponseDTO> getAll(){
        //No caso, provavelmente vai ter que modificar essa func
        //para cada tipo de midia do proj
        List<MidiaResponseDTO> midiaList = midiaRep.findAll().stream().map(MidiaResponseDTO::new).toList();
        return midiaList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveMidia(@RequestBody MidiaRequestDTO data){
        midia midiaData = new midia(data);
        midiaRep.save(midiaData);

    }
}
