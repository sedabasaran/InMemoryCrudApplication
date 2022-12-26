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

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id)
				return programmingLanguage;

		}
		throw new Exception("kayit bulunamadi");

	}

	@Override
	public void create(ProgrammingLanguage programmingLanguage) throws Exception {
		 programmingLanguages.add(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception {
		return programmingLanguage;
	}

	@Override
	public ProgrammingLanguage delete(int id) throws Exception {
		return programmingLanguages.remove(id);

	}
}
