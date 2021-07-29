package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.MyUser;

@Repository
public interface MyRepo extends JpaRepository<MyUser, Integer>{

	Optional<MyUser> findByName(String name);

}
