package com.example.multidatabase.Sakila.Repositories;

import com.example.multidatabase.Sakila.Entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("actorRepository")
public interface ActorRepository extends JpaRepository<Actor, Serializable> {
}
