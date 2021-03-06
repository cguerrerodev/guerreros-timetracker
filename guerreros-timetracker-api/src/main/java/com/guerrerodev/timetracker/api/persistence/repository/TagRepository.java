package com.guerrerodev.timetracker.api.persistence.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guerrerodev.timetracker.api.persistence.entity.TagEntity;

@Repository
public interface TagRepository extends CrudRepository<TagEntity, Long> {
	
	TagEntity findByName(String name);

	
	Set <TagEntity> findByUserName(String userName);
}
