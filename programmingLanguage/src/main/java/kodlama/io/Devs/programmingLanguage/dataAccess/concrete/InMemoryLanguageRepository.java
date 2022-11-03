package kodlama.io.Devs.programmingLanguage.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.programmingLanguage.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.programmingLanguage.entities.concrete.Language;
@Repository //data access nesnesi
public class InMemoryLanguageRepository implements LanguageRepository{
	
	private List<Language> languages;

	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "Python"));
		languages.add(new Language(3, "C++"));
		languages.add(new Language(4, "Php"));
		languages.add(new Language(5, "C#"));
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void delete(int id) {
		languages.remove(bring(id));
		
		//languages.removeIf(language->language.getId()==id);   //lambda expression
	}

	@Override
	public Language bring(int id) {
		
		for(Language language : getAll()) {
			if(language.getId() == id) {
				return language;
			}
		}
		return null;
		
	}

	@Override
	public void update(int id,Language language) {
		
		Language inDbLanguage = bring(id);
		inDbLanguage.setName(language.getName());
		
		
		
		/*for (Language langOld : languages) {
			if(language.getId() == langOld.getId()) {
				langOld.setName(language.getName());
			}*/
		}
	}

	
	
	
	
	


