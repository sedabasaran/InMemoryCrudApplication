package com.example.crudAppication.dataAccess.abstracts;

import java.util.List;

import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();

}
