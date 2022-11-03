package kodlama.io.Devs.programmingLanguage.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.programmingLanguage.entities.concrete.Language;


public interface LanguageRepository {
	
	List<Language> getAll();
	
	void add(Language language);
	void delete(int id);
	Language bring(int id);
	void update(int id,Language language);

}
