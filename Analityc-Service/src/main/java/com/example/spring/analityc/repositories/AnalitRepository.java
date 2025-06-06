package com.example.spring.analityc.repositories;

import com.example.spring.analityc.entities.Statistic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnalitRepository extends CrudRepository<Statistic, Integer> {
    @Query("select s from Statistic s")
    List<Statistic> getAll ();

    @Query("select s from Statistic s where s.nameProducts = :nameProduct")
    Optional<Statistic> findProductByName(String nameProduct);

}
