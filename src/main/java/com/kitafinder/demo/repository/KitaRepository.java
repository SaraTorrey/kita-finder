package com.kitafinder.demo.repository;

import com.kitafinder.demo.domain.Kita;

import org.springframework.data.repository.CrudRepository;

public interface KitaRepository extends CrudRepository<Kita, Long> {

}