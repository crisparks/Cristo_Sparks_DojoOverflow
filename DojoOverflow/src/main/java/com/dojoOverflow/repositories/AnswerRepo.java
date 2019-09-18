package com.dojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojoOverflow.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository <Answer, Long> {

}