package com.sysgroup.mediasys.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import com.sysgroup.mediasys.entity.ClientEntity;
import com.sysgroup.mediasys.entity.MaterialEntity;
import com.sysgroup.mediasys.entity.SceneEntity;
import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.entity.UserGroupEntity;
import com.sysgroup.mediasys.enums.EnumMaterial;
import com.sysgroup.mediasys.repository.ClientRepository;
import com.sysgroup.mediasys.repository.MaterialRepository;
import com.sysgroup.mediasys.repository.SceneRepository;
import com.sysgroup.mediasys.repository.UserGroupRepository;
import com.sysgroup.mediasys.repository.UserRepository;

public class RepositoryTest  extends BaseJUnit4Test{
	
	@Autowired
	UserGroupRepository userGroupRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	MaterialRepository materialRepository;
	
	@Autowired
	SceneRepository sceneRepository;
	
	public static final String[] svens = {"市川雅美","伊东千奈美","辉月杏梨", "波多野结衣", "椎名空", "铃木真夕", "长谷川留衣"};
	
	
	@Test
	@Transactional
	public void testGetSceneByPaging() {
		Sort sort = new Sort(Direction.DESC, "sceneId");
		PageRequest page = new PageRequest(0, 5, sort);
		Page<SceneEntity> entities = sceneRepository.findAll(page);
		for(SceneEntity entity : entities) {
			System.out.println(entity.toString());
			for(MaterialEntity mater : entity.getTbMaterials()) {
				System.out.println(mater.getMaterName());
			}
		}
	}
	
	@Test
	@Transactional
	public void testGetMaterialByPaging() {
		Sort sort = new Sort(Direction.DESC, "uploadDate");
		PageRequest page = new PageRequest(0, 10, sort);
		Page<MaterialEntity> entites = materialRepository.findAll(page);
		
		for(MaterialEntity entity : entites) {
			System.out.println(entity.toString());
		}
		
	}
	
	@Test
	@Transactional
	public void getScene() {
		SceneEntity entity = new SceneEntity();
		entity = sceneRepository.findOne(5);
		List<MaterialEntity> maters = entity.getTbMaterials();
		for(MaterialEntity mate : maters) {
			System.out.println(mate.toString());
		}
	}
	
	@Test
	public void addScene() {
		
		for(int i = 1; i <= svens.length; i++) {
			SceneEntity entity = new SceneEntity();
			entity.setSceneLayout("sffsdfd".getBytes());
			entity.setSceneLength(100);
			entity.setSceneName(svens[i-1] + "集合");
//			entity.setTbMaterials((List<MaterialEntity>) materialRepository.findAll());
			sceneRepository.save(entity);
		}
		
	}
	
	@Test
	public void addRel() {
		SceneEntity entity = sceneRepository.findOne(5);
		List<MaterialEntity> entities =  (List<MaterialEntity>) materialRepository.findAll();
		entity.setTbMaterials(entities);
		sceneRepository.save(entity);
	}
	
	@Test
	public void getAllMaterial() {
		for(MaterialEntity entity : materialRepository.findAll()) {
			System.out.println(entity.getMaterName());
		}
//		System.out.println(materialRepository.findOne(1).getMaterName());
		
	}
	
	@Test
	public void addMaterial() {
		MaterialEntity entity = new MaterialEntity();
		for(int i = 1; i<10; i++) {
			entity.setLocation("/usr/material/"+ i + ".flv");
			entity.setMaterCode(EnumMaterial.VIDEO.getCode());
			entity.setMaterName("苍老师最新" + i);
			entity.setMaterSize("30M");
			entity.setMaterTime(300);
			entity.setUploadDate(new Timestamp(System.currentTimeMillis()));
			entity.setUserId(1);
			materialRepository.save(entity);
		}
	}
	
	
	@Test
	public void addUserGroup() {
		UserGroupEntity entity = new UserGroupEntity();
		entity.setGroupDecp("测试");
		entity.setGroupName("重庆分部");
		userGroupRepository.save(entity);
	}

	@Test 
	public void findUserGroup() {
		UserGroupEntity entity = userGroupRepository.findOne(1);
		System.out.println(entity.toString());
	}

	@Test
	public void addUser() {
		UserEntity entity = new UserEntity();
		entity.setUserName("admin");
		entity.setUserPasswd("admin");
//		entity.setTbUerGroup(tbUerGroup);
		userRepository.save(entity);
	}
	
	@Test
	public void findUser() {
		UserEntity entity = userRepository.findOne(1);
		System.out.println(entity.getUserName());
	}


	@Test
	public void addClient() {
		ClientEntity entity = new ClientEntity();
		entity.setClientIp("192.168.0.12");
		entity.setClientLastConnect(new Timestamp(System.currentTimeMillis()));
		entity.setClientMac("SD:FD:DS:BG");
		entity.setClientName("终端2");
		entity.setIsConnected(false);
		clientRepository.save(entity);
	}
	
	
	@Test
	public void getClientsByGroupId() {
		List<ClientEntity> clients = clientRepository.getClientsByGroupId(1);
		
		for(ClientEntity entity : clients) {
			System.out.println(entity.getClientName());
		}
		
	}
	
}
