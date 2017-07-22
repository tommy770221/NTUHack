package com.ntuhackathon.ubike.repository;

import com.ntuhackathon.ubike.model.BikeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends CrudRepository<BikeEntity,Integer> {

         @Query("select  AVG(b.scoreBike) from BikeEntity b where b.bikeName=:bikeName ")
         Double avgScore(@Param(value = "bikeName") String bikeName);
}
