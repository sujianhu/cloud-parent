package com.sjh.sjhweb.entity.map;

import java.util.List;

import com.sjh.sjhweb.entity.UserEntity;

public interface UserMapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}