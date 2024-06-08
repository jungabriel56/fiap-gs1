package com.github.gji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gji.model.Peixe;


@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long>{

}
