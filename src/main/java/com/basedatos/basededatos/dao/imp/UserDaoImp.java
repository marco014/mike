package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<UserModel> getAll(){
        String hql = "FROM UserModel as u";
        return (List<UserModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public UserModel get( long id){
        return entityManager.find(UserModel.class, id);

    }
    @Transactional
    @Override
    public UserModel register( UserModel userModel){
        entityManager.merge(userModel);
        return userModel;
    }
    @Transactional
    @Override
    public UserModel update( UserModel userModel){
        entityManager.merge(userModel);
        return userModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        UserModel userModel = get(id);
        entityManager.remove(userModel);
    }
}
