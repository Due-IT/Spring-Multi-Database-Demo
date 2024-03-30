package com.example.multidatabase.World.Repositories;

import com.example.multidatabase.World.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<Country, Serializable> {
}
