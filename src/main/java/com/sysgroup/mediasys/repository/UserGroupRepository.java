package com.sysgroup.mediasys.repository;

import org.springframework.data.repository.CrudRepository;

import com.sysgroup.mediasys.entity.UserGroupEntity;

public interface UserGroupRepository extends CrudRepository<UserGroupEntity, Integer> {

	UserGroupEntity findByGroupName(String name);
}
