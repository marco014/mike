package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MarcoModel;
import com.basedatos.basededatos.services.MarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/marco")
public class MarcoController {
    @Autowired
    MarcoService marcoService;

    @GetMapping("/getAll")
    List<MarcoModel> getAllMarco(){
        return marcoService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MarcoModel getMarcoById(@PathVariable("id") long id ){
        return marcoService.get(id);
    }

    @PostMapping(value = "/create")
    MarcoModel createMArco(@RequestBody MarcoModel marcoModel){
        return marcoService.register(marcoModel);
    }

    @PutMapping(value = "/update/{id}")
    MarcoModel updateMarcoById(@RequestBody MarcoModel marcoModel){
        return marcoService.update(marcoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteMarcoById(@PathVariable("id") long id){
        marcoService.delete(id);
    }
}
