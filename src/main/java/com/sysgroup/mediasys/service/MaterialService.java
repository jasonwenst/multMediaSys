package com.sysgroup.mediasys.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sysgroup.mediasys.entity.MaterialEntity;

public interface MaterialService {

	
	Page<MaterialEntity> getEntitiesByPage(Pageable page);
}
