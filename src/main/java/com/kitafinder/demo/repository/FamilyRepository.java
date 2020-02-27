package com.kitafinder.demo.repository;

import com.kitafinder.demo.domain.Family;

import org.springframework.data.repository.CrudRepository;

public interface FamilyRepository extends CrudRepository<Family, Long> {

}