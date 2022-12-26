package com.example.crudAppication.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/getById{id}")
	public ProgrammingLanguage getById(@PathVariable int id) throws Exception {
		return programmingLanguageService.getById(id);
	}

	@PostMapping("/create")
	public void create(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		 programmingLanguageService.create(programmingLanguage);
	}

	@PutMapping("/update")
	public ProgrammingLanguage update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		return programmingLanguageService.update(programmingLanguage);
	}

	@DeleteMapping("/delete{id}")
	public ProgrammingLanguage delete(@PathVariable int id) throws Exception {
		return programmingLanguageService.delete(id);
	}

}
