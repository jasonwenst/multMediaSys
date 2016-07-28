package com.sysgroup.mediasys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sysgroup.mediasys.entity.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
	
	@Query("SELECT  e from ClientEntity e join e.tbUerGroup u where  u.groupId  = ?1")
	List<ClientEntity> getClientsByGroupId(int groupId);

}
