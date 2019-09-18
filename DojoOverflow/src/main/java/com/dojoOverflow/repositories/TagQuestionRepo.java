package com.dojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojoOverflow.models.TagQuestion;

@Repository
public interface TagQuestionRepo extends CrudRepository <TagQuestion, Long> { 

}