package kodlama.io.Devs.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.Devs.programmingLanguage.entities.concrete.Language;

public interface LanguageServise {

	List<Language> getAll();

	void add(Language language) throws Exception;

	void delete(int id) throws Exception;

	Language bring(int id) throws Exception;

	void update(int id, Language language) throws Exception;

}
