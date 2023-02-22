package com.basedatos.basededatos.repository;

import com.basedatos.basededatos.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
