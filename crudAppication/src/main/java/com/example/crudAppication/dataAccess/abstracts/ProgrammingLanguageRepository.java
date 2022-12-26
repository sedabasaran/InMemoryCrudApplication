package com.example.crudAppication.dataAccess.abstracts;

import java.util.List;

import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id) throws Exception;

	void create(ProgrammingLanguage programmingLanguage) throws Exception;

	ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception;
	
	ProgrammingLanguage delete(int id) throws Exception;

}
