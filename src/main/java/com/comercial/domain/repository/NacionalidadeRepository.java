package com.comercial.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comercial.domain.model.Nacionalidade;


@Repository
public interface NacionalidadeRepository extends JpaRepository<Nacionalidade, Long>{

}
