package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MakerModel;
import com.basedatos.basededatos.models.ProducerModel;
import com.basedatos.basededatos.services.MarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/marker")
public class MarkerController {
    @Autowired
    MarkerService markerService;

    @GetMapping("/getAll")
    List<MakerModel> getAll(){
        return markerService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MakerModel getById(@PathVariable("id") long id ){
        return markerService.get(id);
    }

    @PostMapping(value = "/create")
    MakerModel create(@RequestBody MakerModel makerModel){
        return markerService.register(makerModel);
    }

    @PutMapping(value = "/update/{id}")
    MakerModel updateById(@RequestBody MakerModel makerModel ){
        return markerService.update(makerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteById(@PathVariable("id") long id){
        markerService.delete(id);
    }
}
