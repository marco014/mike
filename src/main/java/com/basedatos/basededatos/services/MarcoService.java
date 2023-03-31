package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.MarcoDao;
import com.basedatos.basededatos.models.MarcoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class MarcoService {
    @Autowired
    MarcoDao marcoDao;

    public List<MarcoModel> getAll(){
        return marcoDao.getAll();
    }

    public MarcoModel get(long id){

        return marcoDao.get(id);
    }

    public MarcoModel register(MarcoModel marcoModel){
        return marcoDao.register(marcoModel);
    }

    public MarcoModel update(@RequestBody MarcoModel marcoModel){
        return marcoDao.update(marcoModel);
    }

    public void delete(@PathVariable long id){
        marcoDao.delete(id);
    }
}
