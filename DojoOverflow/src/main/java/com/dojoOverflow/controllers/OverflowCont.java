package com.dojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojoOverflow.models.Answer;
import com.dojoOverflow.models.Question;
import com.dojoOverflow.services.OverflowService;

@Controller
public class OverflowCont {
	private final OverflowService overflowService;
	
	public OverflowCont(OverflowService overflowService) {
		this.overflowService = overflowService;
	}
	
	@GetMapping("")
	public String questionsDashboard(Model model) {
		Iterable<Question> questions = overflowService.getAllQuestions();
		model.addAttribute("question", questions);
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestions(@ModelAttribute("questionObject") Question question) {
		return "new.jsp";
	}

	@GetMapping("/view")
	public String newAnswer(@ModelAttribute("answerObject") Answer answer) {
		return "view.jsp";
	}
	
	@PostMapping("/addanswer")
	public String addAnswer(@Valid @ModelAttribute("answerObject") Answer answer, BindingResult result) {
		return "redirect:";
	}
	
	@PostMapping("/addquestion")
	public String addQuestion(@RequestParam("tagReq") String tags, @Valid @ModelAttribute("questionObject") Question question, BindingResult result) {
		return "redirect:/view";
	}
}