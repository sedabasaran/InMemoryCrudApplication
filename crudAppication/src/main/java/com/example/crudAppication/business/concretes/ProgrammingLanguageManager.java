package com.example.crudAppication.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudAppication.business.abstracts.ProgrammingLanguageService;
import com.example.crudAppication.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.crudAppication.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public void create(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programming Language name can not be empty.");
		}
		for (ProgrammingLanguage programmingLanguages : getAll()) {
			if (programmingLanguages.getId() == programmingLanguage.getId()) {
				throw new Exception("Programming Language name can not be repeated.");
			}
		}
		programmingLanguageRepository.create(programmingLanguage);
	}
	
	@Override
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception {
		return programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage delete(int id) throws Exception {
		return programmingLanguageRepository.delete(id);
	}

}
