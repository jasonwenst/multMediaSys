package com.sysgroup.mediasys.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sysgroup.mediasys.entity.SceneEntity;

public interface SceneRepository extends CrudRepository<SceneEntity, Integer>, PagingAndSortingRepository<SceneEntity, Integer> {
	
}
