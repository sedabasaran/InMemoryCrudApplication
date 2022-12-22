package com.example.crudAppication.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crudAppication.business.abstracts.ProgrammingLanguageService;
import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programmingLanguages")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

}
