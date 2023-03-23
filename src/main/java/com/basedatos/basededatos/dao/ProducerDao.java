package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.ProducerModel;
import java.util.List;

public interface ProducerDao {
    List<ProducerModel> getAll();
    ProducerModel get( long id);
    ProducerModel register( ProducerModel producerModel);
    ProducerModel update( ProducerModel producerModel);
    void delete(  long id);
}
