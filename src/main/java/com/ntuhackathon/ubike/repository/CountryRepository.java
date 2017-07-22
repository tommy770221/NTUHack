package com.ntuhackathon.ubike.repository;

import com.ntuhackathon.ubike.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Integer> { 
    
}