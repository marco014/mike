package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.MarkerDao;
import com.basedatos.basededatos.dao.ProducerDao;
import com.basedatos.basededatos.models.MakerModel;
import com.basedatos.basededatos.models.ProducerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class MarkerService {
    @Autowired
    MarkerDao markerDao;

    public List<MakerModel> getAll(){
        return markerDao.getAll();
    }

    public MakerModel get( long id){

        return markerDao.get(id);
    }

    public MakerModel register( MakerModel makerModel){
        return markerDao.register(makerModel);
    }

    public MakerModel update(@RequestBody MakerModel makerModel){
        return markerDao.update(makerModel);
    }

    public void delete(@PathVariable long id){
        markerDao.delete(id);
    }
}
