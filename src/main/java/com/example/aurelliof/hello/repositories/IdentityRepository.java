package com.example.aurelliof.hello.repositories;

import com.example.aurelliof.hello.model.Identity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityRepository extends JpaRepository <Identity, Integer> {
}
