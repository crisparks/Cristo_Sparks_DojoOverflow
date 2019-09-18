package com.dojoOverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojoOverflow.models.Question;
import com.dojoOverflow.repositories.AnswerRepo;
import com.dojoOverflow.repositories.QuestionRepo;
import com.dojoOverflow.repositories.TagQuestionRepo;
import com.dojoOverflow.repositories.TagRepo;


@Service
public class OverflowService {
	private final AnswerRepo answerRepo;
	private final QuestionRepo questionRepo;
	private final TagRepo tagRepo;
	private final TagQuestionRepo tagQuestionRepo;
	
	public OverflowService(AnswerRepo answerRepo, QuestionRepo questionRepo, TagRepo tagRepo, TagQuestionRepo tagQuestionRepo) {
		this.answerRepo = answerRepo;
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
		this.tagQuestionRepo = tagQuestionRepo;
	}
	
	
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}
}