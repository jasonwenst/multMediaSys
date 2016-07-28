package com.sysgroup.mediasys.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sysgroup.mediasys.entity.MaterialEntity;

public interface MaterialRepository extends CrudRepository<MaterialEntity, Integer>, PagingAndSortingRepository<MaterialEntity, Integer>{

}
