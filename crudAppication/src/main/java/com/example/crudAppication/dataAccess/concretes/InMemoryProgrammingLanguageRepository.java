package com.example.crudAppication.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.crudAppication.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	public InMemoryProgrammingLanguageRepository() {
		super();
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(3, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(4, "JavaScript"));
		programmingLanguages.add(new ProgrammingLanguage(5, "Node.js"));

	}

}
