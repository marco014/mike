package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProducerModel;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.ProducerServices;
import com.basedatos.basededatos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    @Autowired
    ProducerServices producerServices;

    @GetMapping("/getAllP")
    List<ProducerModel> getAll(){
        return producerServices.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProducerModel getById(@PathVariable("id") long id ){
        return producerServices.get(id);
    }

    @PostMapping(value = "/create")
    ProducerModel create(@RequestBody ProducerModel producerModel){
        return producerServices.register(producerModel);
    }

    @PutMapping(value = "/update/{id}")
    ProducerModel updateById(@RequestBody ProducerModel producerModel ){
        return producerServices.update(producerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteById(@PathVariable("id") long id){
        producerServices.delete(id);
    }
}
