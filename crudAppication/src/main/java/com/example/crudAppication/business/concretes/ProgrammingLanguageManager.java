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
	public ProgrammingLanguage create(ProgrammingLanguage programmingLanguage) throws Exception {
		return programmingLanguageRepository.create(programmingLanguage);
	}

}
