package com.example.crudAppication.business.abstracts;

import java.util.List;

import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id) throws Exception;

	ProgrammingLanguage create(ProgrammingLanguage programmingLanguage) throws Exception;

}
