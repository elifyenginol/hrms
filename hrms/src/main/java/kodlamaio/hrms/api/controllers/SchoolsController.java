package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@GetMapping("/getAll")
	DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	
//	@GetMapping("/getByUserId")
//	DataResult<List<School>> getByUserId(@RequestParam int userId){
//		return this.schoolService.getByUserId(userId);
//	}
//	
//	@GetMapping("/getAllByUserIdOrderByEndYear")
//	DataResult<List<School>> getAllByUserIdOrderByEndYear(@RequestParam int userId){
//		return this.schoolService.getAllByUserIdOrderByEndYear(userId);
//	}

}
