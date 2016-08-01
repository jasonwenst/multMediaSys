package com.sysgroup.mediasys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysgroup.mediasys.entity.MaterialEntity;
import com.sysgroup.mediasys.repository.MaterialRepository;


@Service("materialService")
@Transactional
public class MaterialServiceImp implements MaterialService {
	
	@Autowired
	private MaterialRepository materRepository;

	public Page<MaterialEntity> getEntitiesByPage(Pageable page) {
		return  materRepository.findAll(page);
	}


}
