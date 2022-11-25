package com.semicolonafrica.locationmanagementapi.repositories;

import com.semicolonafrica.locationmanagementapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

    public UserEntity findByEmailAndPassword(String email, String password);
}
