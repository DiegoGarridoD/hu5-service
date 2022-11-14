package com.pep2.hu5service.repository;


import com.pep2.hu5service.entity.SueldoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SueldoRepository extends CrudRepository<SueldoEntity, Long> {
}
