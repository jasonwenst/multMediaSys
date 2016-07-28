package com.sysgroup.mediasys.repository;

import org.springframework.data.repository.CrudRepository;

import com.sysgroup.mediasys.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
