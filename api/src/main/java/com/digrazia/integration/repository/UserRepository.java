package com.digrazia.integration.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, String> {
    Optional<UserEntity> findByUsername(String username);

    @Query("select u from User u where u.id = :id")
    Optional<UserEntity> findByIdWithQuery(String id);

    @Modifying
    @Query("select u from User u where u.id = :id")
    Optional<UserEntity> findByIdWithModifying(String id);

}
