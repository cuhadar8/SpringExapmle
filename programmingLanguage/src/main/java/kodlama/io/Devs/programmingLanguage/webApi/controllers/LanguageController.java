package kodlama.io.Devs.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.programmingLanguage.business.abstracts.LanguageServise;
import kodlama.io.Devs.programmingLanguage.entities.concrete.Language;

@RestController //spring buradan erişim noktası olduğunu anlar
@RequestMapping ("/api/languages")
public class LanguageController {
	
	private LanguageServise languageServise;

	
	@Autowired
	public LanguageController(LanguageServise languageServise) {
		super();
		this.languageServise = languageServise;
	}
	
	@GetMapping("/getall")
	List<Language> getAll(){
		return languageServise.getAll();
	}
	
	@PostMapping("/add")
	void add(Language language) throws Exception {
		languageServise.add(language);
	}
	
	@DeleteMapping("/delete")
	void delete(int id) throws Exception {
		languageServise.delete(id);
	}
	
	@PutMapping("/update")
	void update(int id,Language language) throws Exception {
		languageServise.update(id,language);
	}
	
	@GetMapping("/bring")
	Language bring(int id) throws Exception {
		return languageServise.bring(id);
	}

}
