package com.dojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojoOverflow.models.Tag;

@Repository
public interface TagRepo extends CrudRepository <Tag, Long> {

}