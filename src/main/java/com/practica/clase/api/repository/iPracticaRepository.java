package com.practica.clase.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.practica.clase.api.beans.entity.PracticaEntity;

public interface iPracticaRepository extends CrudRepository<PracticaEntity, Integer>{

}
